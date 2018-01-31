package com.example.ist_mac_01.lab4ex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t1 = (TextView)findViewById(R.id.result);
        Intent intent = getIntent();
        Double a = intent.getDoubleExtra("result",0);

        t1.setText(Double.toString(a));



    }
}
