package com.solvd.market.shop;

import com.solvd.market.utils.WritingToFile;


import java.io.IOException;
import java.util.*;

public class MeatProduct extends Food {

    private String foodName;
    private String expDate;
    private int protein;
    private int kkal;
    public final int NDS = 20;



    public MeatProduct() {
        super();

    }

    public MeatProduct(String foodName, String expDate) {
        super(foodName, expDate);
        this.foodName = foodName;
        this.expDate = expDate;
    }

    public MeatProduct(String name) {
        super(name);
    }
    public String callMeatList() {
            String name = consoleFoodName();
            String expDate = consoleExpDate();
            MeatProduct meatProduct = new MeatProduct(name, expDate);
        WritingToFile writingToFile = new WritingToFile();
        writingToFile.WritingToFile("C:/Users/user/Desktop/test.txt", name, expDate);
            addFood(meatProduct);
            System.out.println("ok)");
            System.out.println("Do you want do add meat again ?(y/n)");
            Scanner addMeatAgain = new Scanner(System.in);
            String addMeatAgain1 = addMeatAgain.nextLine();
            if (addMeatAgain1.equals("y") | addMeatAgain1.equals("Y")) {
                callMeatList();
            }
            for (int i = 0; i <= 1; i++) {
                int menuGetNumber = menu();
                switch (menuGetNumber) {
                    case 1:
                        removeFood(meatProduct);
                        System.out.println("Meat is removed ");
                        break;
                    case 2:
                        System.out.println("Meat list");
                        PrintFoodList();
                    break;

                    case 3:
                        System.exit(0);
                        break;
                    case 4:
                        callMeatList();
                        break;
                }
            }
            return name + expDate;
    }


    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getProtein() {
        return protein;
    }


    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }

    @Override
    public void printException() throws Exception {
        System.out.println("Here is Exception ");
        throw new Exception();
    }


}
