package org.example.factory;

import org.example.model.Food;

public interface FoodFactory {
    Food createSandwich();
    Food createSalad();
    Food createColdCut();
    Food createDessert();
}
