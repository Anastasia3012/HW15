package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {

    private final Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product) {
        if (count >= products.length) {
            System.out.println("Невозможно добавить продукт!");
            return;
        }
        products[count] = product;
        count++;
    }

    public double allSum(ProductBasket product) {
        double cost = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                cost = cost + products[i].getPrice();
            }
        }
        return cost;
    }

    public void printBasket(ProductBasket product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            } else {
                System.out.println("В корзине пусто!");
            }
        }
        int specilCount = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].isSpecial()) {
                specilCount++;
            }
        }
        System.out.println("Итого: " + allSum(product));
        System.out.println("Количество специальных товаров: " + specilCount);
    }

    public boolean searchName(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getName().equals(name)) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public void cleanBasket(ProductBasket product) {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println(Arrays.toString(products));
    }

}
