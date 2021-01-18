package com.solvd.market;

import com.solvd.market.exception.ShopException;
import com.solvd.market.build.Warehouse;
import com.solvd.market.shop.*;
import com.solvd.market.utils.ReadingFromFile;
import com.solvd.market.utils.WRFromProperty;
import com.solvd.market.utils.WritingToFile;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Enumeration;
import java.util.Scanner;


public class Executor {
    public static void main(String[] args) throws Exception, ShopException {
  /*      ReadingFromFile readingFromFile = new ReadingFromFile();
        readingFromFile.readingFromFile("C:/Users/user/Desktop/test.txt");*/
/*        WRFromProperty wrFromProperty = new WRFromProperty();
        wrFromProperty.writeToProperty("Second.properties", "Password","visaR999");
        String getValue = wrFromProperty.getProperty("Second.properties", "Password");
        System.out.println(getValue);*/
        /*MeatProduct meatProduct = new MeatProduct();
        meatProduct.callMeatList();*/
    /*    WritingToFile writingToFile1 = new WritingToFile();
        writingToFile.WritingToFile("C:/Users/user/Desktop/test.txt", "asdfjfd", "12.12.2100");*/
     /*   Warehouse warehouse = new Warehouse();
        warehouse.addMeat();*/
        Warehouse warehouse = new Warehouse();
        /*warehouse.addMeat();*/
        warehouse.addMilk();

    }




}



