package com.example.allanralph.hostelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Cal extends AppCompatActivity {

    TextView calno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        calno=(TextView)findViewById(R.id.calno);
        calno.setText("9489132396");
        Linkify.addLinks(calno,Linkify.PHONE_NUMBERS);
    }
}

