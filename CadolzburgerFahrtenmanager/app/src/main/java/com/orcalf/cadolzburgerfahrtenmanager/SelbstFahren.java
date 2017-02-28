package com.orcalf.cadolzburgerfahrtenmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SelbstFahren extends AppCompatActivity {
    EditText name,abfahrt,ankunft,kommentar;
    Button senden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selbst_fahren);
        name = (EditText) findViewById(R.id.nameInput);
        abfahrt = (EditText) findViewById(R.id.abfahrtInput);
        ankunft = (EditText) findViewById(R.id.ankunftInput);
        kommentar = (EditText) findViewById(R.id.kommentarInput);
        senden= (Button) findViewById(R.id.weiter);

        senden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SelbstFahren2.class);
                intent.putExtra("key_1",getText());
                System.out.println(getText());
                startActivity(intent);
            }
        });
    }
    public String getText()
    {
        return name.getText().toString()+"#"+abfahrt.getText().toString()+"#"+ankunft.getText().toString()+"#"+kommentar.getText().toString();
    }
}
