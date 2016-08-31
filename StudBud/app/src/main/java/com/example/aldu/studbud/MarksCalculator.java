package com.example.aldu.studbud;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MarksCalculator extends AppCompatActivity {


    private int subjectID;
    private User user;
    private Calculator calculator;
    private double markOne;
    private EditText editTextOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markscalculator);
        setupUI();
        user = new User("Karl",0,3);
        subjectID = user.getMainSubjectID();
        calculator = new Calculator();
        calculator.calculateMarks(subjectID);

    }

    private void setupUI(){
        editTextOne = (EditText)findViewById(R.id.mark1);
        markOne = Double.parseDouble(editTextOne.getText().toString());
    }

    private void setMarksToCalculate(){
        Intent i = new Intent(MarksCalculator.this,Calculator.class);
        i.putExtra("markOne",markOne);
        startService(i);
    }

}
