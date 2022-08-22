import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        ArrayList<Food> productsList = new ArrayList<>();
        productsList.add(meat);
        productsList.add(redApple);
        productsList.add(greenApple);
        ShoppingCart shoppingCart = new ShoppingCart(productsList);
        System.out.println("Сумма товаров без учета скидки: " + Float.toString(shoppingCart.getSumWithoutDiscount()));
        System.out.println("Сумма скидки: " + Float.toString(shoppingCart.getSumOfDiscount()));
        System.out.println("Сумма вегетарианских товаров без скидки: " + Float.toString(shoppingCart.getSumOfVegetables()));
    }
}
