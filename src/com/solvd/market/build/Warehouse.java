package com.solvd.market.build;

import com.solvd.market.shop.*;

import javax.jws.Oneway;
import java.security.PrivateKey;
import java.util.*;

public class Warehouse {
    Scanner answer = new Scanner(System.in);
    int answer1;

    public Warehouse() {

    }

    public void addMeat(){
        MeatProduct meatProduct = new MeatProduct();
        meatProduct.callMeatList();

    }
    public void addMilk(){
        MilkProducts milkProducts = new MilkProducts();
        milkProducts.addMilkProduct();

    }

    public void addNonAlcoDrink(){
        NonAlcoholic nonAlcoholic1 = new NonAlcoholic();
        nonAlcoholic1.addDrinkList();
    }
    public void addPhone(){
        Phones phone1 = new Phones();
        phone1.addPhoneList();
    }




}

