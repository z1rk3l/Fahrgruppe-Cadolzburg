package com.orcalf.cadolzburgerfahrtenmanager;

import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Handler handler=null;
    ListView listView ;
    private Button absenden;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            handler=Handler.getInstance();
            text=handler.getContent();


        } catch (Exception e) {
            Context context = getApplicationContext();
            CharSequence text = "Hello toast!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            try {
                Thread.sleep(10000);
            }
            catch(Exception ex)
            {

            }
        }

        final Object test=this;
        absenden = (Button) findViewById(R.id.selbst) ;

        absenden.setOnClickListener(MainActivity.this);

        listView = (ListView) findViewById(R.id.list);

        String[] values_pre = text.split("[;]");
        String[][] value=new String[values_pre.length][4];
        for(int i=0;i<values_pre.length;i++)
         value[i] = values_pre[i].split("[#]");
        String[] values=new String[values_pre.length];

        for(int i=0;i<values_pre.length;i++)
        {
            values[i]="Um "+value[i][3]+" nach "+value[i][1];
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                int itemPosition     = position;

                String  itemValue    = (String) listView.getItemAtPosition(position);
                startNew(text.split("[;]")[position]);
            }
        });


    }
    public void startNew(String s) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("key_1",s);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, SelbstFahren.class);
        intent.putExtra("key_1","");
        startActivity(intent);
    }


}
