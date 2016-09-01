package com.example.aldu.studbud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MarksCalculator extends AppCompatActivity {


    private int subjectID;
    private User user;
    private Calculator calculator;
    public double markOne;
    public double markTwo;
    private EditText editTextOne;
    private EditText editTextTwo;
    private Button calculateButton;
    private double[] inf01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markscalculator);
        setupUI();
        inf01 = new double[2];
        user = new User("Karl",0,3);
        subjectID = user.getMainSubjectID();
        calculator = new Calculator();
        onCalClick();

    }


    private void readUserInput() {
        markOne = Double.parseDouble(editTextOne.getText().toString());
        markTwo = Double.parseDouble(editTextTwo.getText().toString());
        inf01[0] = markOne;
        inf01[1] = markTwo;

    }


    private void setupUI() {
        editTextOne = (EditText) findViewById(R.id.mark1);
        editTextTwo = (EditText) findViewById(R.id.mark2);
        calculateButton = (Button)findViewById(R.id.calculateButton);
    }


    private void onCalClick(){
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readUserInput();
                calculator.calculateMarks(subjectID, inf01);
            }
        });
    }



}
