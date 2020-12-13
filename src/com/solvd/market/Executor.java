package com.solvd.market;

import com.solvd.market.metro.*;

public class Executor {
    public static void main(String[] args) {
        System.out.println("===COW====");
        MilkProducts happyCow = new MilkProducts("Happy Cow");
        happyCow.setAnimalMilk("Cow");
        happyCow.setProtein(12);
        happyCow.setCarbohydrate(23);
        happyCow.setWeight(500);
        happyCow.setKkal(288);
        happyCow.setFat(7);
        happyCow.printInfo();

        System.out.println("===PORK===");
        MeetProduct pork = new MeetProduct("Sad pork");
        pork.setProtein(35);
        pork.setFat(26);
        pork.setKkal(488);
        pork.setWeight(1000);
        pork.printInfo();

        System.out.println("===Wheat===");
        WheatProduct rice = new WheatProduct("Best Rice");
        rice.setProtein(13);
        rice.setCarbohydrate(20);
        rice.setFat(2);
        rice.setKkal(288);
        rice.setTypeWheat("Poaceae");
        rice.setWeight(400);
        rice.printInfo();

        System.out.println("==Drink===");
        Drink cola = new Drink("Coca=Cola");
        cola.setFuzzyDrink(true);
        cola.setAlcohol(false);
        cola.setProtein(2);
        cola.setWeight(300);
        cola.setCarbohydrate(12);
        cola.setKkal(322);
        cola.setFat(2);
        cola.printInfo();

        System.out.println("===Fruits===");
        Fruits avocado = new Fruits("Avocado");
        avocado.setProtein(35);
        avocado.setCarbohydrate(20);
        avocado.setFat(15);
        avocado.setKkal(370);
        avocado.setWeight(240);
        avocado.printInfo();

        System.out.println("===Alcohol=====");
        AlcoholicDrink metaxa = new AlcoholicDrink("Metaxa");
        metaxa.setAlcohol(39);
        metaxa.setKkal(999);
        metaxa.setWeight(500);
        metaxa.printInfo();

    }


}
