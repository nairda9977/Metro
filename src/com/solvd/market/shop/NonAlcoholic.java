package com.solvd.market.shop;

public class NonAlcoholic extends Drink implements Location {
    private int protein;
    private int carbohydrate;
    private int kkal;

    public NonAlcoholic() {
        super();
    }

    public NonAlcoholic(String drinkName) {
        super(drinkName);
    }

    public void location() {
        System.out.println("Non alcoholic drink should be near Alcoholic");
    }

    public void Kkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }

    public void printInfo() {
        System.out.println("Name : " + getDrinkName());
        System.out.println("Protein " + protein + " gr");
        System.out.println("Carbohidrate " + carbohydrate + " gr");
        System.out.println("Kkal " + kkal);
    }
    public String toDrink (){
        return "toDrink";
    }
}