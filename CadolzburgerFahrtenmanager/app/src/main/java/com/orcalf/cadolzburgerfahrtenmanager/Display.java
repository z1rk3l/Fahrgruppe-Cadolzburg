package com.orcalf.cadolzburgerfahrtenmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class Display extends AppCompatActivity implements View.OnClickListener {
    String text,send;
    TextView name,abfahrt,ankunft,kommentar,zeit,plaetze;
    Button mitfahren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        name = (TextView) findViewById(R.id.fahrer);
        abfahrt = (TextView) findViewById(R.id.abfahrt);
        ankunft = (TextView) findViewById(R.id.ankunft);
        kommentar = (TextView) findViewById(R.id.kommentar);
        zeit = (TextView) findViewById(R.id.zeit);
        plaetze = (TextView) findViewById(R.id.frei);

        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            text = extras.getString("key_1");
        }
        String[] tokens = text.split("[#]");

        name.append(tokens[0]);
        abfahrt.append(tokens[1]);
        ankunft.append(tokens[2]);
        kommentar.append(tokens[3]);
        zeit.append(tokens[4]+":"+tokens[5]);
        plaetze.append(tokens[6]);

        mitfahren=(Button) findViewById(R.id.mitfahren);
        mitfahren.setOnClickListener(Display.this);

        send=tokens[0]+tokens[1]+tokens[2];
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
