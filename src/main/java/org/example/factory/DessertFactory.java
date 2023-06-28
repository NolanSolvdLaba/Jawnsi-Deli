package org.example.factory;

import org.example.model.*;

public class DessertFactory {
    public ColdCut createColdCut() {
        return null;
    }

    public Sandwich createSandwich() {
        return null;
    }

    public Salad createSalad() {
        return null;
    }

    public Dessert createDessert(String name, double price) {
        return new Dessert(name, price);
    }
}
