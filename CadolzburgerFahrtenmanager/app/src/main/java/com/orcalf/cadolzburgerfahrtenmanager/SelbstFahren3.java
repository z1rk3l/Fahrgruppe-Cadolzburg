package com.orcalf.cadolzburgerfahrtenmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TimePicker;

import java.io.IOException;

public class SelbstFahren3 extends AppCompatActivity  {
    NumberPicker num;
    Button senden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selbst_fahren3);

        senden= (Button) findViewById(R.id.weiter);
        num = (NumberPicker) findViewById(R.id.numberPicker);
        senden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Working!!");
                try {
                    System.out.println(getFahrt().getString());
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
        String send= getIntent().getExtras().getString("key_1")+"#"+String.valueOf(num.getValue());
        Fahrt f=new Fahrt();
        System.out.println(send);
        return f.fahrtAusString(send);
    }
}
