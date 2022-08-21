package model;

public class Apple extends Food implements Discountable {

    String colour;

    public Apple(int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if (colour.equals("red")) {
            return 60;
        }
        else {
            return 0;
        }
    }
}
