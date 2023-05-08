package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText e;
  Button b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.editTextNumber2);
        b1 = findViewById(R.id.button3);
        b2 = findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = Double.parseDouble(e.getText().toString());
                double k = ((1.8f*p)+32);
                e.setText(String.format("%.2f",k));
                Toast.makeText(MainActivity.this,String.format("%.2f",k)+"F",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p1 = Double.parseDouble(e.getText().toString());
                double k1 = ((p1-32)*5)/9;
                e.setText(String.format("%.2f",k1));
                Toast.makeText(MainActivity.this,String.format("%.2f",k1)+"C",Toast.LENGTH_SHORT).show();
            }
        });
    }
}