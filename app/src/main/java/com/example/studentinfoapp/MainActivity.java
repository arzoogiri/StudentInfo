package com.example.studentinfoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etRollNo, etAddress;
    private RadioGroup radioGroupGender;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etRollNo = findViewById(R.id.etRollNo);
        etAddress = findViewById(R.id.etAddress);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String rollNo = etRollNo.getText().toString();
                String address = etAddress.getText().toString();

                int selectedId = radioGroupGender.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);
                String gender = selectedRadioButton != null ? selectedRadioButton.getText().toString() : "";

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("ROLL_NO", rollNo);
                intent.putExtra("GENDER", gender);
                intent.putExtra("ADDRESS", address);
                startActivity(intent);
            }
        });
    }
}
