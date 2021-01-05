package com.solvd.market;

import com.solvd.market.build.Warehouse;
import com.solvd.market.shop.*;
import com.sun.org.apache.bcel.internal.generic.ALOAD;

import javax.security.auth.login.AccountExpiredException;
import java.lang.reflect.Array;
import java.util.*;


public class Executor {
    public static void main(String[] args) {
    Food meat = new MeatProduct("meat1");
    Food chiken = new MeatProduct("Chiken");
    Food cow = new MeatProduct("Cow");
    Drink water = new NonAlcoholic("Water");
    Technik samsung = new Phones("samsung1");

    Warehouse warehouse = new Warehouse();
    warehouse.addFood(meat);
    warehouse.addFood(chiken);
    warehouse.addDrink(water);
    warehouse.addFood(cow);
    warehouse.addTech(samsung);
    warehouse.addTech(samsung);
    warehouse.addTech(samsung);
   warehouse.printFields();
   warehouse.removeFood(meat);
   warehouse.printFields();
    }


}
