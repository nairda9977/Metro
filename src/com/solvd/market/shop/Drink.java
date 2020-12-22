package com.solvd.market.shop;

public abstract class Drink extends Shop {
    private String drinkName;
    private int weight;


    public Drink() {
        drinkName = "default";
    }

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void printInfo() {

    }


}
