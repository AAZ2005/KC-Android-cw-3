package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ImageView lightblue = findViewById(R.id.blue);

        Button calculate = findViewById(R.id.calc);

        EditText firstnumber = findViewById(R.id.first);
        EditText secondnumber= findViewById(R.id.second);

        TextView calculator = findViewById(R.id.calco);
        TextView total = findViewById(R.id.tot);
    }
}