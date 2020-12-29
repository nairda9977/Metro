package com.solvd.market.shop;

public class MeatProduct extends Food  {
    public final int nds=20;
    public int price;
    private int protein;
    private int carbohydrate;
    private int fat;
    private int kkal;

    public MeatProduct() {
        super();
    }

    public MeatProduct(String foodname) {
        super(foodname);
    }

    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }



    @Override
    public String toEat() {
        return "eatMeat";
    }
    public void toEat(boolean isToEat){
    if(isToEat){
        System.out.println("is To Eat");
    }
    else {
        System.out.println("Dont Eat");
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
        System.out.println("Meet should be near milk products");
    }
}
