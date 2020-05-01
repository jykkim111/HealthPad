package com.example.diet.ui.exercise;

public class ExerciseActivity {

    int imageSrc;
    String activityName;
    String activityDescription;

    public ExerciseActivity(int imageSrc, String text1, String text2){
        this.imageSrc = imageSrc;
        this.activityName = text1;
        this.activityDescription = text2;
    }

    public int getImageSrc(){
        return imageSrc;
    }

    public String getActivityName(){
        return activityName;
    }

    public String getActivityDescription(){
        return activityDescription;
    }


}
