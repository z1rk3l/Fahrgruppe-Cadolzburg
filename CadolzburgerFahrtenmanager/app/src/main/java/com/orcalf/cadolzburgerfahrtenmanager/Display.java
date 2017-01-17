package com.orcalf.cadolzburgerfahrtenmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class Display extends AppCompatActivity implements View.OnClickListener {
    String text,send;
    TextView name,ort,zeit,kommentar;
    Button mitfahren;
    //Test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            text = extras.getString("key_1");
        }

        name = (TextView) findViewById(R.id.name);
        ort = (TextView) findViewById(R.id.ort);
        zeit = (TextView) findViewById(R.id.zeit);
        name = (TextView) findViewById(R.id.name);
        kommentar = (TextView) findViewById(R.id.kommentar);
        String[] tokens = text.split("[#]");

        name.append(tokens[2]);
        ort.append(tokens[1]);
        zeit.append(tokens[3]);
        kommentar.append(tokens[0]);

        mitfahren=(Button) findViewById(R.id.mitfahren);
        mitfahren.setOnClickListener(Display.this);

        send=tokens[2];
    }
    @Override
    public void onClick(View v)
    {
        try {
            Handler.getInstance().mitfahren(send);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
