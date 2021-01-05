package com.solvd.market.shop;

public class SmartTechnik implements Technik  {
     public String name;
    public int issueDate;

    public SmartTechnik(){

    }
    public SmartTechnik(String name, int issueDate){
        this.name=name;
        this.issueDate=issueDate;
    }

    public String toString(){
        return "Smart tech : " + name + " " +issueDate;
    }

    public String getName(String name){
        return name;
    }
    public int getDate(int issueDate){
        return issueDate;
    }




}
