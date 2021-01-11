package com.solvd.market.shop;

import java.io.IOException;
import java.util.*;

public class MeatProduct extends Food {
    int i;
    Scanner name = new Scanner(System.in);
    private String name1;
    Scanner expDate = new Scanner(System.in);
    private String expDate1;
    Scanner answer = new Scanner(System.in);
    int answer1;
    Scanner addMeatAgain = new Scanner(System.in);
    String addMeatAgain1;
    private int protein;
    private int kkal;


    public final int NDS = 20;


    List<Food> freezer;

    public MeatProduct() {
        freezer = new ArrayList<Food>();
    }

    @Override
    public void printException() throws Exception {
        System.out.println("Here is Exception ");
        throw new Exception();
    }


    public MeatProduct(String name1, String expDate1) {
        this.name1 = name1;
        this.expDate1 = expDate1;
    }


    public void addMeatList() {
        System.out.println("Print meat name");
        name1 = name.nextLine();
        for (int i = 0; i <= 50; i++) {
            if (name1.isEmpty()) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Please enter meat name");
                    name1 = name.nextLine();
                }finally {
                    System.out.println("Thanks");
                }
            }
        }
        System.out.println("Print exp. date");
        expDate1 = expDate.nextLine();
        for (int i = 0; i <= 40; i++) {
            if (expDate1.isEmpty()) {
                System.err.println("Please enter exp date");
                expDate1 = expDate.nextLine();
            }
        }
        MeatProduct meatProduct = new MeatProduct(name1, expDate1);
        addFood(meatProduct);
        System.out.println("(" + name1 + ")" + "  Product added");
        System.out.println("Do you want do add meat again ?(y/n)");
        addMeatAgain1 = addMeatAgain.nextLine();
        if (addMeatAgain1.equals("y") | addMeatAgain1.equals("Y")) {
            addMeatList();
        } else if (addMeatAgain1 != ("y")) {
            System.out.println("ok)");
        }
        for (int i = 0; i <=1; i++) {

            do {
                System.out.println("What to do next ?, Chose a number");
                System.out.println("1.Delete meat");
                System.out.println("2.Print meat list");
                System.out.println("3.Exit");
                System.out.println("4.Retun to adding");
                while (!answer.hasNextInt()) {
                    System.out.println("Not a number");
                    answer.next();
                }
                answer1 = answer.nextInt();
            } while (answer1 != 1 && answer1 != 2 && answer1 != 3 && answer1 != 4);

            switch (answer1) {
                case 1:
                    removeFood(meatProduct);
                    System.out.println("   Meat product is removed ");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("     Meat list");
                    PrintFoodList();
                    System.out.println("  ");
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    addMeatList();
                    break;

            }
        }

    }


    public String toString  () {
        return "Meat Product : " + name1 + "   Expiry Date is : " + expDate1;

    }


    public void addFood(Food food) {
        freezer.add(food);
    }

    public void removeFood(MeatProduct meatProduct) {
        freezer.remove(meatProduct);
    }

    public void PrintFoodList() {
        for (Object food : freezer) {
            System.out.println(food);
        }
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



}
