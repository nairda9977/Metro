package com.solvd.market.metro;

public class MeetProduct extends Metro {
    private String meetColour;

    public MeetProduct() {
        super();
    }

    public MeetProduct(String name) {
        super((name));
    }

    public void setMeetColour(String meetColour) {
        this.meetColour = meetColour;
    }

    public String getMeetColour() {
        return meetColour;
    }


    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");

    }
}
