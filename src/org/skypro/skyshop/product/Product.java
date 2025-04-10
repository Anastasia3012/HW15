package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {

    private final String name;
    private final int sum;

    public Product(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Наименование: " + name +
                ", Стоимость: " + sum + " рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return sum == product.sum && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum);
    }
}

