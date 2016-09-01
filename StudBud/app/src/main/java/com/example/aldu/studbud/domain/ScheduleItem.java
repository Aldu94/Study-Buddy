package com.example.aldu.studbud.domain;

/**
 * Created by Aldu on 01.09.16.
 */
public class ScheduleItem {

    private String title;
    private int startTime;
    private int endTime;
    private String room;

    public ScheduleItem(String title, int startTime, int endTime, String room){
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
    }


    // getter-methods

    public String getTitle(){
        return title;
    }

    public int getStartTime(){
        return startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public String getRoom(){
        return room;
    }


    //setter-methods

    public void setTitle(String title){
        this.title = title;
    }

    public void setStartTime(int startTime){
        this.startTime = startTime;
    }

    public void setEndTime(int endTime){
        this.endTime = endTime;
    }

    public void setRoom(String room){
        this.room = room;
    }
}
