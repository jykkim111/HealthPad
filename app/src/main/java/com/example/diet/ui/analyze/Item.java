package com.example.diet.ui.analyze;

public class Item {

    int imageSrc;
    String foodName;
    String foodDescription;

    public Item(int imageSrc, String text1, String text2){
        this.imageSrc = imageSrc;
        this.foodName = text1;
        this.foodDescription = text2;
    }

    public int getImageSrc(){
        return imageSrc;
    }

    public String getFoodName(){
        return foodName;
    }

    public String getFoodDescription(){
        return foodDescription;
    }


}
