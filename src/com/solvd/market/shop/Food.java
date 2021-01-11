package com.solvd.market.shop;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public abstract class Food {
    private String foodName;
    private int weight;

    public Food() {
        foodName = "default";
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }



    public String getFoodName(){
        return this.foodName;
}

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void printInfo() {

    }
    public abstract void printException() throws Exception;






}
