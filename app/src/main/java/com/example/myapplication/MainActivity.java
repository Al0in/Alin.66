package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      b= (Button)findViewById(R.id.SendButton) ;
      e= (EditText)findViewById(R.id.PersonName);

      b.setOnClickListener( V-> {

          String str = e.getText().toString();
          Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
          intent.putExtra("PersonName", str);
          startActivity(intent);
      });






    }


}