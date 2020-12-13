package com.solvd.market.metro;

public class AlcoholicDrink extends Drink {
    private int alcohol;

    public AlcoholicDrink(){
        super();
    }
    public AlcoholicDrink(String name){
        super(name);
    }

    public void setAlcohol(int alcohol){
        this.alcohol=alcohol;
    }
    public int getAlcohol(){
        return alcohol;
    }
    public  void printInfo(){
        System.out.println(getName());
        System.out.println("Alcohol "+alcohol+"%");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");
    }
}
