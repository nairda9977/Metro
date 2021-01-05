package com.solvd.market.shop;

public class Phones extends SmartTechnik{
    public String name;

    public Phones(){

    }
    public Phones(String name){
        this.name=name;
    }

    public String toString(){
        return "Phone is : "+name;
    }
    public String getName(String name){
        return this.name;
    }


    public void printFields(){

    }
}
