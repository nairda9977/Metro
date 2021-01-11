package com.solvd.market.shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlcoholicDrink extends Drink  {
    Scanner name = new Scanner(System.in);
    private String name1;
    Scanner expDate = new Scanner(System.in);
    private String expDate1;
    private int alcohol;
    private int protein;
    private int carbohydrate;
    private int kkal;



    public AlcoholicDrink() {

    }

    public void addAlcoholList() throws IOException {

    }


    public AlcoholicDrink(String name1, String expDate1) {
        this.name1 = name1;
        this.expDate1 = expDate1;
    }

    public String toString() {
        return "Alcoholic Drink : " + name1 + "    Expire Date is : " + expDate1;
    }




    public int getAlcohol() {
        return alcohol;
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

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }

    public String himher(String himher) {
        return "this alcool is for " + himher;
    }

    public void printInfo() {
        System.out.println("Name is " + getDrinkName());
        System.out.println("Alcohol " + alcohol + "%");
        System.out.println("Kkal " + kkal);

    }

    public void location() {
        System.out.println("Meet should be near Non-Alcoholic");
    }
}