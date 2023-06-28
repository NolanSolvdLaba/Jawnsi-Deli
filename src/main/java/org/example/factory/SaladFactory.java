package org.example.factory;

import org.example.model.ColdCut;
import org.example.model.Dessert;
import org.example.model.Salad;
import org.example.model.Sandwich;

public class SaladFactory {
    public ColdCut createColdCut() {
        return null;
    }

    public Sandwich createSandwich() {
        return null;
    }

    public Salad createSalad(String name, double price) {
        return new Salad(name, price);
    }

    public Dessert createDessert() {
        return null;
    }
}
