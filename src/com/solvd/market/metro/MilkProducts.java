package com.solvd.market.metro;

public class MilkProducts extends Metro {
    private String animalMilk;

    public MilkProducts() {
        super();
    }

    public MilkProducts(String name) {
        super(name);
    }

    public void setAnimalMilk(String animalMilk) {
        this.animalMilk = animalMilk;
    }

    public String getAnimalMilk() {
        return animalMilk;
    }

    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");
        System.out.println("Animal Milk: " + getAnimalMilk());
    }

}
