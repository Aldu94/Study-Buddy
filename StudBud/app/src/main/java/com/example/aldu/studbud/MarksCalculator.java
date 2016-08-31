package com.example.aldu.studbud;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class MarksCalculator extends AppCompatActivity {


    private int subjectID;
    private User user;
    private Calculator calculator;
    public double markOne;
    public double markTwo;
    private String editTextOne;
    private String editTextTwo;
    private Button calculateButton;
    private double[] inf01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markscalculator);
        setupUI();
        user = new User("Karl",0,3);
        subjectID = user.getMainSubjectID();
        calculator = new Calculator();
        readAndSpeak();
        onCalClick();

    }

    private void readAndSpeak() {
        try{
            markOne = Double.valueOf(editTextOne);
            markTwo = Double.parseDouble(editTextOne);
        } catch (NumberFormatException e){
            markOne = 0;
            markTwo = 0;
        }
    }

    private void setupUI() {
        editTextOne = ((EditText) findViewById(R.id.mark1)).getText().toString();
        editTextTwo = ((EditText) findViewById(R.id.mark2)).getText().toString();
        calculateButton = (Button)findViewById(R.id.calculateButton);
    }

    private void onCalClick(){
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.calculateMarks(subjectID, markOne);
            }
        });
    }
}
