package com.solvd.market;

import com.solvd.exception.ShopException;
import com.solvd.market.build.Warehouse;
import com.solvd.market.shop.*;


public class Executor {
    public static void main(String[] args) throws Exception, ShopException {
    Food meat = new MeatProduct("Pork", "12.12.2021");
    Food chiken = new MeatProduct("Chiken", "20.12.2021");
    Food cow = new MeatProduct("Cow", "20.12.2021");
    Drink water = new NonAlcoholic("Water", "12.02.2025");
    MeatProduct meatList = new MeatProduct("pork", "20.12.2021");

    Warehouse warehouse = new Warehouse();
    warehouse.addMeat();
    WheatProduct wheatProduct = new WheatProduct();
    wheatProduct.printException();
    throw new ShopException();


    }


}
