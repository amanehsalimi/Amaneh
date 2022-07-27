package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateIntervalFormat;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setText(new Date().toString());







    }
}