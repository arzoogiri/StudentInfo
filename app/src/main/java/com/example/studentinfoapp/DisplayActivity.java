package com.example.studentinfoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView tvName, tvRollNo, tvGender, tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvName = findViewById(R.id.tvName);
        tvRollNo = findViewById(R.id.tvRollNo);
        tvGender = findViewById(R.id.tvGender);
        tvAddress = findViewById(R.id.tvAddress);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String rollNo = intent.getStringExtra("ROLL_NO");
        String gender = intent.getStringExtra("GENDER");
        String address = intent.getStringExtra("ADDRESS");

        tvName.setText("Name: " + name);
        tvRollNo.setText("Roll No: " + rollNo);
        tvGender.setText("Gender: " + gender);
        tvAddress.setText("Address: " + address);
    }
}
