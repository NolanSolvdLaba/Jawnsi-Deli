package org.example.factory;

import org.example.model.*;

public class ColdCutFactory implements FoodFactory {
    public ColdCut createColdCut(String name, double price) {
        return new ColdCut(name, price);
    }

    @Override
    public ColdCut createColdCut() {
        return null;
    }

    @Override
    public Sandwich createSandwich() {
        return null;
    }

    @Override
    public Salad createSalad() {
        return null;
    }

    @Override
    public Dessert createDessert() {
        return null;
    }
}
