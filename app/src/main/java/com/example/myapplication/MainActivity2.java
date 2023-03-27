package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg = (TextView) findViewById(R.id.received_value);

        Intent intent = getIntent();

        String str =intent.getStringExtra("PersonName");

        msg.setText("Hello, "+ str + " !");

    }
}