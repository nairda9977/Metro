package com.solvd.market.shop;

import com.solvd.market.utils.WritingToFile;


import java.util.Scanner;

public class MilkProducts extends Food  {
    private int protein;
    private int carbohydrate;
    private int fat;
    private int kkal;
    private String expDate;

    public MilkProducts() {

        super();
    }

    public MilkProducts(String foodName, String expDate) {
        super(foodName, expDate);
    }

    @Override
    public void printException() {

    }

    public String toEat(){
        return "toEat";
    }

    public void addMilkProduct(){
        String name=consoleFoodName();
        String expDate=consoleExpDate();
        MilkProducts milkProducts = new MilkProducts(name, expDate);
        WritingToFile writingToFile = new WritingToFile();
        writingToFile.WritingToFile("C:/Users/user/Desktop/test.txt", name, expDate);
        addFood(milkProducts);
        System.out.println("Do you want to add again ?(y/n)");
        Scanner addAgain = new Scanner(System.in);
        String addAgain1=addAgain.nextLine();
        if(addAgain1.equalsIgnoreCase("y")){
            addMilkProduct();
        }
        int menuGetNumber = menu();
        switch (menuGetNumber) {
            case 1:
                removeMilk(milkProducts);
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
                addMilkProduct();
                break;
        }
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getProtein() {
        return protein;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFat() {
        return fat;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }


    public void location() {
        System.out.println("milk should be near Meet Product");
    }


}
