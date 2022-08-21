package model;

public abstract class Food {

    int amount;
    float price;
    boolean isVegetarian;

    public Food(int amount, float price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }
}
