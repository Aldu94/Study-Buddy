package com.example.aldu.studbud;

/**
 * Created by Aldu on 31.08.16.
 */
public class User {

    private String name;
    private int mainSubjectID;
    private int numberOfSemester;

    public User(String name, int mainSubjectID, int numberOfSemester){
        this.name = name;
        this.mainSubjectID = mainSubjectID;
        this.numberOfSemester = numberOfSemester;
    }

    //gibt Namen des Nutzers zurück
    public String getName(){
        return name;
    }

    //gibt ID des Hauptfachs zurück (1/0)
    public int getMainSubjectID(){
        return mainSubjectID;
    }

    //gibt Semesteranzahl zurück
    public int getNumberOfSemester(){
        return numberOfSemester;
    }
}
