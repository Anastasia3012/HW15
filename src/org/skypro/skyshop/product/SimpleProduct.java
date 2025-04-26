package org.skypro.skyshop.product;

public class SimpleProduct extends Product {

    private final int price;

    public SimpleProduct(String name, int price) {
        super(name);
        if (price <= 0) {
            throw new IllegalArgumentException("Сумма некорректна");
        }
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return "Товар: " + getName() +
                ", Стоимость: " + getPrice() + " рублей.";
    }

}
