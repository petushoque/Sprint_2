package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    String colour;

    public Apple(int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.SALE;
        }
        else {
            return 0;
        }
    }
}
