package com.solvd.market.metro;

public class Drink extends Metro {
    private boolean alcohol = false;
    private boolean fuzzyDrink = true;

    public Drink() {
        super();
    }

    public Drink(String name) {
        super(name);
    }


    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public void setFuzzyDrink(boolean fuzzyDrink) {
        this.fuzzyDrink = fuzzyDrink;
    }


    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Fuzzy Drink: " + fuzzyDrink);
        System.out.println("alcohol contail: " + alcohol);
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");

    }

}
