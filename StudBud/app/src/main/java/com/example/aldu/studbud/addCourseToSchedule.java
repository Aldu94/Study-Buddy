package com.example.aldu.studbud;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aldu.studbud.domain.ScheduleItem;

public class AddCourseToSchedule extends AppCompatActivity {

    private EditText courseTitle;
    private EditText startTime;
    private EditText endTime;
    private EditText room;
    private Button addButton;

    private String title;
    private int timeStart;
    private int timeEnd;
    private String roomToStudy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course_to_schedule);
        setupUI();
        readUserInput();
        onAddButtonClicked();
    }

    private void setupUI(){
        courseTitle = (EditText)findViewById(R.id.title_text);
        startTime = (EditText)findViewById(R.id.start_time_text);
        endTime = (EditText)findViewById(R.id.end_time_text);
        room = (EditText)findViewById(R.id.room_text);
        addButton = (Button)findViewById(R.id.add_course_button);
    }

    private void onAddButtonClicked(){
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open database
                ScheduleItem si = new ScheduleItem(title,timeStart,timeEnd,roomToStudy);
                //add schedule item to database
                Intent i = new Intent(AddCourseToSchedule.this,Schedule.class);
                //put extra to intent
                startActivity(i);
                //close database
            }
        });
    }

    private void readUserInput(){
        title = courseTitle.getText().toString();
        timeStart = Integer.parseInt(startTime.getText().toString());
        timeEnd = Integer.parseInt(endTime.getText().toString());
        roomToStudy = room.getText().toString();
    }

}
