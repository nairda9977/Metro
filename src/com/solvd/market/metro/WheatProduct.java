package com.solvd.market.metro;

public class WheatProduct extends Metro {
    private String typeWheat;

    public WheatProduct() {
        super();
    }

    public WheatProduct(String name) {
        super(name);

    }

    public void setTypeWheat(String typeWheat) {
        this.typeWheat = typeWheat;
    }

    public String getTypeWheat() {
        return typeWheat;
    }

    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Type of wheat :" + typeWheat);
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");

    }
}
