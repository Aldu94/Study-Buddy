package com.example.aldu.studbud;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MarksCalculator extends AppCompatActivity {


    private static final int INFWISS_ID = 0;
    private static final int MEDINFO_ID = 1;
    private int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markscalculator);
        calculateMarks();
    }

    private void calculateMarks(){
        if(id == INFWISS_ID){
            calculateInfwissAsMainSubject();
        }
        else{
            calculateMedInfoAsMainSubject();
        }
    }


    private void calculateInfwissAsMainSubject(){

    }

    private void calculateMedInfoAsMainSubject() {

    }

}
