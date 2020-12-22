package com.solvd.market;

import com.solvd.market.build.Warehouse;
import com.solvd.market.shop.*;

public class Executor {
    public static void main(String[] args) {


        System.out.println("=WAREHOUSE=");
        Food meatproduct = new MeatProduct("ChikenMeat");
        Food milkproducts = new MilkProducts("CowMilk");

        Drink nonAlcoholic = new NonAlcoholic("Apple juice");
        Drink alcoholic = new AlcoholicDrink("Jack-Daniels");

        Warehouse warehouse = new Warehouse();
        warehouse.addFood(milkproducts);
        warehouse.addDrink(alcoholic);
        warehouse.printInfo();

        System.out.println(meatproduct.toEat());
        Food fruits = new Fruits();
        System.out.println(fruits.toEat());


    }


}
