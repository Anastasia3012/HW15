package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.ProductBasket;

import java.util.Objects;

public abstract class Product {

    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getPrice());
    }

    public abstract boolean isSpecial();

}


