package com.orcalf.cadolzburgerfahrtenmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class SelbstFahren2 extends AppCompatActivity {
    TimePicker time;
    Button senden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selbst_fahren2);

        senden= (Button) findViewById(R.id.weiter);
        time = (TimePicker) findViewById(R.id.timePicker);

        senden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SelbstFahren3.class);
                intent.putExtra("key_1",getText());
                startActivity(intent);
            }
        });



    }
    public String getText()
    {
        int hour = time.getCurrentHour();
        int minute = time.getCurrentMinute();
        System.out.println(getIntent().getStringExtra("key_1"));
        return getIntent().getExtras().getString("key_1")+"#"+String.valueOf(hour)+"#"+String.valueOf(minute);
    }
}
