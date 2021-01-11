package com.solvd.market.shop;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Phones extends SmartTechnik{
    Scanner name = new Scanner(System.in);
    private String name1;
    Scanner issueYear = new Scanner(System.in);
    private String issueYear1;
    Scanner addPhoneAgain = new Scanner(System.in);
    String addPhoneAgain1;
    Scanner answer = new Scanner(System.in);
    int answer1;

    Set<Phones> phoneHouse;

    public Phones(){
            phoneHouse = new HashSet<Phones>();
    }
    public Phones(String name1, String issueYear1){
        this.name1=name1;
        this.issueYear1=issueYear1;
    }

    public void addPhoneList() {
        System.out.println("Add phone name");
        name1 = name.nextLine();
        for (int i = 0; i < 40; i++) {
            if (name1.isEmpty()) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Please enter phone name");
                    name1 = name.nextLine();
                }
            }
        }
        System.out.println("Add issue year ");
        issueYear1 = issueYear.nextLine();
        for (int a = 0; a < 30; a++) {
            if (issueYear1.isEmpty()) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Please enter issue year");
                    issueYear1 = issueYear.nextLine();
                }
            }
        }
        Phones phone3 = new Phones(name1, issueYear1);
        addPhone(phone3);
        System.out.println("DO you want to add phone again ?(y/n)");
        addPhoneAgain1 = addPhoneAgain.nextLine();
        if (addPhoneAgain1.equals("y")) {
            addPhoneList();
        }
        for (int i = 0; i <=1; i++) {
            do {
                System.out.println("What to do next ?");
                System.out.println("1.Delete phone");
                System.out.println("2.Print Phone list");
                System.out.println("3.Exit");
                System.out.println("4.Return to adding");
                while (!answer.hasNextInt()) {
                    System.out.println("Not a number");
                    answer.next();
                }
                answer1 = answer.nextInt();
            } while (answer1 != 1 && answer1 != 2 && answer1 != 3 && answer1 != 4);

            switch (answer1) {
                case 1:
                    removePhone(phone3);
                    System.out.println("Phone deleted");
                    break;
                case 2:
                    printPhoneList();
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    addPhoneList();
                    break;
            }
        }
    }

    public void addPhone(Phones phones){
        phoneHouse.add(phones);
    }

    public void removePhone(Phones phones){
        phoneHouse.remove(phones);
    }
    public void printPhoneList(){
        for(Object phone: phoneHouse){
            System.out.println(phone);
        }
    }

    public String toString(){
        return "Phone is :"+name1+"  "+"Issue year is :"+issueYear1;
    }


    public void printFields(){

    }
}
