package com.solvd.market.shop;

public class MilkProducts extends Food implements Location {
    private int protein;
    private int carbohydrate;
    private int fat;
    private int kkal;

    public MilkProducts() {

        super();
    }

    public MilkProducts(String foodName) {

        super(foodName);
    }
    public String toEat(){
        return "toEat";
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
