package com.stock;

public class Goods {
    public static String priseOfGood;
    static String nameOfGood;
    public static void setPriseOfGood(String prise){
        priseOfGood = prise;
    }
    public static String getPriseOfGood(){
        return priseOfGood;
    }
    public void setNameOfGood(String name){
        this.nameOfGood = name;
    }
    public static String getNameOfGood(){
        return nameOfGood;
    }
}

