import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.red);
        Apple greenApple = new Apple(8, 60, Colour.green);
        ArrayList<Food> productsList = new ArrayList<>();
        productsList.add(meat);
        productsList.add(redApple);
        productsList.add(greenApple);
        ShoppingCart shoppingCart = new ShoppingCart(productsList);
        System.out.println(shoppingCart.getSumWithoutDiscount());
    }
}
