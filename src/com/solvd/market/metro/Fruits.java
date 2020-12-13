package com.solvd.market.metro;

public class Fruits extends Metro{
    public Fruits(){
        super();
    }
    public Fruits(String name){
        super(name);
    }
    public  void printInfo(){
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");
    }
}
