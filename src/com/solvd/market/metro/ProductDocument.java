package com.solvd.market.metro;

public class ProductDocument implements ProductsDocumentation, MainPerson {
    public void price(){
        System.out.println("Total price : 280$");
    }
    public void typeOfProduct(){
        System.out.println("Milk");
        System.out.println("Wheat");
        System.out.println("Meet");
        System.out.println("Drink");
    }
    public void bestBefore(){
        System.out.println("25.13.2021");
        System.out.println("25.13.2021");
        System.out.println("25.13.2021");
        System.out.println("25.13.2021");
    }
    public void post(){
        System.out.println("Manager");
    }
    public void managerName(){
        System.out.println("Vasilii Makarenko");
    }
}
