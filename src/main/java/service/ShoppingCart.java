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
            Food product = food.get(i);
            result = result + product.getPrice() * product.getAmount();
        }
        return result;
    }

    public float getSumWithDiscount() {
        float result = 0;
        for (int i = 0; i < food.size(); i++) {
            Food product = food.get(i);
            result = result + product.getPrice() - (product.getPrice() * (product.getDiscount() / 100));
        }
        return result;
    }

    public float getSumOfVegetables() {
        float result = 0;
        for (int i = 0; i < food.size(); i++) {
            Food product = food.get(i);
            if (product.isVegetarian()) {
                result = result + product.getPrice();
            }
        }
        return result;
    }
}
