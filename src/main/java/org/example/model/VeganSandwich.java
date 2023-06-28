package org.example.model;

public class VeganSandwich extends Sandwich {
    private String meatSubstituteType;

    public VeganSandwich(String name, double price, String meatSubstituteType) {
        super(name, price);
        this.meatSubstituteType = meatSubstituteType;
    }

    public String getMeatSubstituteType() {
        return meatSubstituteType;
    }

    public void setMeatSubstituteType(String meatSubstituteType) {
        this.meatSubstituteType = meatSubstituteType;
    }
}
