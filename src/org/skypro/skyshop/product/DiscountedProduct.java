package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private final double basePrice;
    private final double discount;

    public DiscountedProduct(String name, double basePrice, double discount) {
        super(name);
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Неверное значение суммы");
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Неверные сумма скидки");
        }
        this.discount = discount;
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
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


