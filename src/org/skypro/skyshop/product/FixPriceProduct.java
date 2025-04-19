package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{

    private final static int FIX_SUM = 99;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return FIX_SUM;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "Товар с фиксированной ценой: " + getName() +
                ", Фиксированная стоимость: " + getPrice() + " рублей.";
    }

}
