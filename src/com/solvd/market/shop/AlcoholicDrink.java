package com.solvd.market.shop;

public class AlcoholicDrink extends Drink {
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

    public String toString(){
        return "Alcoholic Drink : " + getDrinkName();
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

    public String himher(String himher){
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