package com.solvd.market.shop;

public class AlcoholicDrink extends Drink implements Location {
    private int alcohol;
    private int protein;
    private int carbohydrate;
    private int kkal;

    public AlcoholicDrink() {
        super();
    }

    public AlcoholicDrink(String name) {
        super(name);
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
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

    public void printInfo() {
        System.out.println("Name is " + getDrinkName());
        System.out.println("Alcohol " + alcohol + "%");
        System.out.println("Kkal " + kkal);

    }

    public void location() {
        System.out.println("Meet should be near Non-Alcoholic");
    }
}