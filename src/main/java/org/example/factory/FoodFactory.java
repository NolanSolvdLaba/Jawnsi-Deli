package org.example.factory;

import org.example.model.Food;
import org.example.model.ColdCut;
import org.example.model.Salad;
import org.example.model.Sandwich;
import org.example.model.Dessert;

public interface FoodFactory {
    ColdCut createColdCut();
    Sandwich createSandwich();
    Salad createSalad();
    Dessert createDessert();
}
