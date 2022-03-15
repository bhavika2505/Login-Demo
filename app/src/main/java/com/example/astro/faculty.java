package com.example.astro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class faculty extends AppCompatActivity {

    private Spinner spinnerlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);


        spinnerlogin = findViewById(R.id.spinnerlogin);

        String[] user = getResources().getStringArray(R.array.user);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,user);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerlogin.setAdapter(adapter);
    }
}