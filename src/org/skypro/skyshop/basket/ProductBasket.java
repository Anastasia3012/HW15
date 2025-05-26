package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {

    private List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double allSum(ProductBasket product) {
        double cost = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null) {
                cost = cost + products.get(i).getPrice();
            }
        }
        return cost;
    }

    public void printBasket(ProductBasket product) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        if (products.isEmpty()) {
            System.out.println("В корзине пусто!");
        }
        int specilCount = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null && products.get(i).isSpecial()) {
                specilCount++;
            }
        }
        System.out.println("Итого: " + allSum(product));
        System.out.println("Количество специальных товаров: " + specilCount);
    }

    public boolean searchName(String name) {
        for (int i = 0; i < products.size()
                ; i++) {
            if (products.get(i) != null && products.get(i).getName().equals(name)) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public void cleanBasket(ProductBasket product) {
        products.clear();
    }

    public List<Product> deleteProduct(String name) {
        List<Product> deleteProducts = new LinkedList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product != null && product.getName().equals(name)) {
                deleteProducts.add(product);
                iterator.remove();
            }
        }
        return deleteProducts;
    }

}
