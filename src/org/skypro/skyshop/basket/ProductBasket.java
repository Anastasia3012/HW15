package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {

    Map<String, List<Product>> products = new TreeMap<>();

    public void addProduct(Product product) {
        List<Product> productList = products.getOrDefault(product.getName(), new LinkedList<>());
        productList.add(product);
        products.put(product.getName(), productList);
    }

    public double allSum() {
        return products.values().stream()
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public long getspecialCount() {
        return products.values().stream()
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .count();
    }

    public void printBasket(ProductBasket productBasket) {
        products.values().stream()
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        System.out.println("Итого: " + allSum());
        System.out.println("Количество специальных товаров: " + getspecialCount());
    }

    public boolean searchName(String name) {
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                if (product != null && product.getName().equals(name)) {
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }

    public void cleanBasket(ProductBasket productBasket) {
        products.clear();
    }

    public List<Product> deleteProduct(String name) {
        List<Product> deleteProducts = new LinkedList<>();

        for (List<Product> productList : products.values()) {
            Iterator<Product> iterator = productList.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product != null && product.getName().equals(name)) {
                    deleteProducts.add(product);
                    iterator.remove();
                }
            }
        }
        return deleteProducts;
    }
}



