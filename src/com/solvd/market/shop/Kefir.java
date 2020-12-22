package com.solvd.market.shop;

public class Kefir extends MilkProducts {
    private String animalMilk;
    private String temperature;

    public Kefir() {
        super();
    }

    public Kefir(String foodName) {
        super(foodName);
    }


    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setAnimalMilk(String animalMilk) {

        this.animalMilk = animalMilk;
    }

    public String getAnimalMilk() {
        return animalMilk;
    }

    public void printInfo() {
        System.out.println("Name : " + getFoodName());
        System.out.println("Temperature " + temperature);
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");

    }
}
