package service;

import model.Food;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Food> food;

    public ShoppingCart(ArrayList<Food> food) {
        this.food = food;
    }

    public float getSumWithoutDiscount() {
        float result = 0;
        for (int i = 0; i < food.size(); i++) {
            result = result + food.get(i).getPrice();
        }
        return result;
    }
}
