package com.solvd.market.shop;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Food {
    private String foodName;
    private String expDate;
    private int weight;


    List<Food> freezer;

    public Food() {
        foodName = "default";
        freezer = new ArrayList<Food>();
    }

    public Food(String foodName, String expDate) {
        this.foodName = foodName;
        this.expDate = expDate;

    }

    public Food(String name) {
        this.name = name;

    }


    public int menu(){
            System.out.println("What to do next ?, Chose a number");
            System.out.println("1.Delete food ?");
            System.out.println("2.Print food list");
            System.out.println("3.Exit");
            System.out.println("4.Retun to adding");
        Scanner menuAnswerSc = new Scanner(System.in);
            while (!menuAnswerSc.hasNextInt()) {
                System.out.println("Not a number");
                menuAnswerSc.next();
            }
            int menuAnswer = menuAnswerSc.nextInt();
            return menuAnswer;
    }

    public void addFood(Food food) {
        freezer.add(food);
    }

    public void removeFood(MeatProduct meatProduct) {
        freezer.remove(meatProduct);
    }
    public void removeMilk(MilkProducts milkProducts) {
        freezer.remove(milkProducts);
    }
    public void PrintFoodList() {
        for (Object food : freezer) {
            System.out.println(food);
        }
    }

    public String toString  () {
        return "Meat Product : " + foodName + "   Expiry Date is : " + expDate;

    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void printInfo() {

    }
    String name;
    public String consoleFoodName() {
        Scanner nameSc = new Scanner(System.in);
        System.out.println("Print food name");
        foodName = nameSc.nextLine();
        for (int limit = 0; limit <= 50; limit++) {
            if (foodName.isEmpty()) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Please enter food name");
                    foodName = nameSc.nextLine();
                } finally {
                    System.out.println("Thanks");
                }
            }
        }
        return foodName;

    }

    public String consoleExpDate() {
        System.out.println("Print exp. date");
        Scanner expDateSc = new Scanner(System.in);
        expDate = expDateSc.nextLine();
        for (int limit = 0; limit <= 40; limit++) {
            if (expDate.isEmpty()) {
                System.err.println("Please enter exp date");
                expDate = expDateSc.nextLine();
            }
        }
        return expDate;

    }



    public abstract void printException() throws Exception;


}
