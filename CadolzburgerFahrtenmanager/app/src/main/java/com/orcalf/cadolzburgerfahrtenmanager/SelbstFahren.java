package com.orcalf.cadolzburgerfahrtenmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

public class SelbstFahren extends AppCompatActivity {
    EditText name,ort,zeit,kommentar;
    Button senden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selbst_fahren);
        name = (EditText) findViewById(R.id.nametext);
        ort = (EditText) findViewById(R.id.orttext);
        zeit = (EditText) findViewById(R.id.zeittext);
        name = (EditText) findViewById(R.id.nametext);
        kommentar = (EditText) findViewById(R.id.kommentartext);
        senden= (Button) findViewById(R.id.absenden);

        senden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Working!!");
                try {
                    Handler.getInstance().sendeFahrt(getFahrt());
                }
                catch(IOException e)
                {
                    System.out.println("Send Problem");
                }
            }
        });



    }

    public Fahrt getFahrt()
    {
        return new Fahrt(zeit.getText().toString(),ort.getText().toString(),kommentar.getText().toString(),name.getText().toString());
    }
}
