package org.example.factory;

import org.example.model.ColdCut;
import org.example.model.Food;

public class ColdCutFactory implements FoodFactory {
    @Override
    public Food createColdCut(String name, double price) {
        return new ColdCut(name, price);
    }
}
