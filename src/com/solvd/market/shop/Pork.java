package com.solvd.market.shop;

public class Pork extends MeatProduct {
    private String temperature;
    public Pork() {
        super();
    }

    public Pork(String name1, String expDate1) {
        super(name1, expDate1);
    }
    public String toString(){
        return "Pork  : " + getFoodName();
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }


    public void location() {
        System.out.println("Should be near cow meat");
    }

    public void printInfo() {
        System.out.println("Name : " + getFoodName());
        System.out.println("Temperature " + temperature);
        System.out.println("Protein " + getProtein() + " gr");

        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");
    }
}
