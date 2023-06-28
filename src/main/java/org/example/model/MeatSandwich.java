package org.example.model;

public class MeatSandwich extends Sandwich {
    private String meatType;

    public MeatSandwich(String name, double price, String meatType) {
        super(name, price);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}
