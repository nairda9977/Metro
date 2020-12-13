package com.solvd.market.metro;

public abstract class Metro implements ProductsDocumentation, MainPerson{
    private String name;
    private int protein;
    private int carbohydrate;
    private int fat;
    private int kkal;
    private int weight;

    public Metro() {
        name = "default";
    }

    public Metro(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getProtein() {
        return protein;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFat() {
        return fat;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void printInfo();

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
        System.out.println("25.102021");
        System.out.println("26.11.2025");
        System.out.println("12.11.2021");
        System.out.println("20.09.2022");
    }
    public void post(){
        System.out.println("Manager");
    }
    public void managerName(){
        System.out.println("Vasilii Makarenko");
    }
}
