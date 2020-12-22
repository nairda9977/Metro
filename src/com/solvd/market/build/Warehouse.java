package com.solvd.market.build;

import com.solvd.market.shop.Drink;
import com.solvd.market.shop.Food;

public class Warehouse {
    private Food freezer;
    private Drink fridge;

    public Warehouse (){

    }

    public Food addFood(Food food){
        this.freezer = food;
    return this.freezer;
    }

    public Drink addDrink(Drink drink){
        this.fridge = drink;
        return this.fridge;
    }

    public void printInfo(){
        System.out.println(this.freezer.getFoodName());
        System.out.println(this.fridge.getDrinkName());
    }
}

