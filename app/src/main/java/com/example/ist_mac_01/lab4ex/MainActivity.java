package com.example.ist_mac_01.lab4ex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button but1,but2;
    EditText editText;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        but1=(Button)findViewById(R.id.button);
        but2=(Button)findViewById(R.id.button2);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(editText.getText().toString());
                Double b = Double.parseDouble(editText2.getText().toString());
                Double result = a+b;

                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                intent.putExtra("result",result);
                startActivity(intent);
            }
        });


        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String geoCode= "google.streetview:cbll=13.7523959,&cbp=100.4925838,,45,1&mz=1";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });

    }
}
