package org.example.factory;

import org.example.model.ColdCut;
import org.example.model.Dessert;
import org.example.model.Salad;
import org.example.model.Sandwich;

public class SandwichFactory {
    public ColdCut createColdCut() {
        return null;
    }

    public Sandwich createSandwich(String name, double price) {
        return new Sandwich(name, price);
    }

    public Salad createSalad() {
        return null;
    }

    public Dessert createDessert() {
        return null;
    }
}
