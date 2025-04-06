package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.ProductBasket;

public class App {

    public static void main(String[] args) {

        Product banana = new Product("Банан", 67);
        Product apple = new Product("Яблоко", 55);
        Product pomegranate = new Product("Гранат", 223);
        Product pear = new Product("Груша", 83);
        Product longan = new Product("Лонган", 301);
        Product kiwi = new Product("Киви", 15);
        Product pineapple = new Product("Ананас", 619);
        Product peach = new Product("Персик", 74);
        Product grape = new Product("Виноград", 436);

        ProductBasket basket1 = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();
        ProductBasket basket3 = new ProductBasket();

//        1. Добавление продукта в корзину.
        basket1.addProduct(banana);
        basket1.addProduct(pomegranate);
        basket1.addProduct(pineapple);
        basket1.addProduct(pear);
        basket1.addProduct(kiwi);
        System.out.println();

//        2. Добавление продукта в заполненную корзину, в которой нет свободного места.
        basket2.addProduct(grape);
        basket2.addProduct(longan);
        basket2.addProduct(pear);
        basket2.addProduct(apple);
        basket2.addProduct(kiwi);
        basket2.addProduct(peach);
        System.out.println();

//        3. Печать содержимого корзины с несколькими товарами.
        basket1.printBasket(banana);
        System.out.println();

//        4. Получение стоимости корзины с несколькими товарами.
        basket1.allSum(banana);
        System.out.println();

//        5. Поиск товара, который есть в корзине.
        basket1.searchName("Груша");
        System.out.println();

//        6. Поиск товара, которого нет в корзине.
        basket2.searchName("Ананас");
        System.out.println();

//        7. Очистка корзины.
        basket1.cleanBasket(banana);
        System.out.println();

//        8. Печать содержимого пустой корзины.
        basket1.printBasket(banana);
        System.out.println();

//        9. Получение стоимости пустой корзины.
        basket1.allSum(banana);
        System.out.println();

//        10. Поиск товара по имени в пустой корзине.
        basket1.searchName("Гранат");

    }

}
