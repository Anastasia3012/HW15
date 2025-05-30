package org.skypro.skyshop.product;

import java.util.Objects;

public abstract class Product implements Searchable {

    private final String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя некорректно");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

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

    @Override
    public String searchContent() {
        return "PRODUCT";
    }

    @Override
    public String searchTerm() {
        return name;
    }

}

