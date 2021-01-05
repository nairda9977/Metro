package com.solvd.market.build;

import com.solvd.market.shop.*;

import javax.jws.Oneway;
import java.security.PrivateKey;
import java.util.*;

public class Warehouse {
    Scanner scan = new Scanner(System.in);
    public String food1;
    Scanner answer = new Scanner(System.in);
    String answer1;
    List<String> foodList = new ArrayList<>();
    List<Food> freezer;
    List<Drink> fridge;
    Set<Technik> techHouse;

    public Warehouse() {
        freezer = new ArrayList<Food>();
        fridge = new LinkedList<Drink>();
        techHouse = new HashSet<Technik>();
    }

    public void addFood() {
        System.out.println("Add food please");
        food1 = scan.nextLine();
        foodList.add(food1);
        for (Object run : foodList) {
            System.out.println("You added : " + run);
        }
        System.out.println("Do you want to add more ? (y/n) ");

        answer1 = answer.nextLine();
        if (answer1.equals("y")) {
            addFood();
        } else {
            System.out.println("ok )");
        }
    }

    public void removeFood(Food food){
        freezer.remove(food);
    }

    public void getFood() {
        for (Object run : freezer) {
            System.out.println(run);
        }
    }

    public void addFood(Food food) {
        freezer.add(food);
    }

    public void addDrink(Drink drink) {
        fridge.add(drink);
    }

    public void addTech(Technik tech) {
        techHouse.add(tech);
    }

    public void printFields() {
        for (Object run : freezer) {
            System.out.println(run);
        }
        for (Object run1 : fridge) {
            System.out.println(run1);
        }
        for (Object run3 : techHouse) {
            System.out.println(run3);
        }
    }


}

