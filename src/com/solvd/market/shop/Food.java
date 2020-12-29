package com.solvd.market.shop;

public abstract class Food {

    private String foodName;
    private int weight;

    public Food() {
        foodName = "default";
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }


    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void printInfo() {

    }
    public abstract String toEat();


}
