package model;

public interface Discountable {

    default float getDiscount() {
        return 0;
    }
}
