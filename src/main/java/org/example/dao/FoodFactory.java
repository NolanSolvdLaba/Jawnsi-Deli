package com.example.dao;

import com.example.model.Food;

public abstract class FoodFactory {
    public abstract Food createSandwich();
    public abstract Food createSalad();
    public abstract Food createColdCut();
    public abstract Food createDessert();
}
