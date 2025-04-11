package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basePrice;
    private final int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        this.discount = discount;
        this.basePrice = basePrice;
    }

    @Override
    public int getPrice() {
        return basePrice - ((basePrice * discount) / 100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "Товар со скидкой: " + getName() +
                ", Стоимость: " + getPrice() + " рублей. (скидка " + discount + "%)";

    }

}


