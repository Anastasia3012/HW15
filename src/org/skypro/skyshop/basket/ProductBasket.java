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

    public int allSum(Product product) {
        int cost = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                cost = cost + products[i].getSum();
            }
        }
        System.out.println(cost);
        return cost;
    }

    public void printBasket(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            } else System.out.println("В корзине пусто!");
        }
        System.out.print("Итого: ");
        allSum(product);
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

    public void cleanBasket(Product product) {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println(Arrays.toString(products));
    }
}
