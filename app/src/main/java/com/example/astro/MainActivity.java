package com.example.astro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    String[] SPINNERVALUES = {"Faculty","Student","Parent"};
    String SpinnerValue;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner =(Spinner)findViewById(R.id.spinnerlogin);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SPINNERVALUES);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                SpinnerValue =  adapterView.getItemAtPosition(i).toString();
//                Toast.makeText(getApplicationContext(),SPINNERVALUES[i], Toast.LENGTH_LONG).show();
//                switch (SpinnerValue){
//                    case "Faculty":
//                        intent = new Intent(MainActivity.this, faculty.class);
//                        startActivity(intent);
//                        break;
//
//                    case "Student":
//                        intent = new Intent(MainActivity.this, student.class);
//                        startActivity(intent);
//                        break;
//
//                    case "Parent":
//                        intent = new Intent(MainActivity.this, parent.class);
//                        startActivity(intent);
//                        break;
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        SpinnerValue =  adapterView.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(),SPINNERVALUES[i], Toast.LENGTH_LONG).show();
        switch (SpinnerValue){
            case "Faculty":
                intent = new Intent(MainActivity.this, faculty.class);
                startActivity(intent);
                break;

            case "Student":
                intent = new Intent(MainActivity.this, student.class);
                startActivity(intent);
                break;

            case "Parent":
                intent = new Intent(MainActivity.this, parent.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}