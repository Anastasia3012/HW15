package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.ProductBasket;

import java.util.Arrays;

public class App {

    public static void main(String[] args) throws BestResultNotFoundExtends {

        Product banana = new SimpleProduct("Банан", 67);
        Product apple = new SimpleProduct("Яблоко", 55);
        Product pomegranate = new SimpleProduct("Гранат", 223);
        Product pear = new SimpleProduct("Груша", 83);
        Product longan = new SimpleProduct("Лонган", 301);
        Product kiwi = new SimpleProduct("Киви", 15);
        Product pineapple = new SimpleProduct("Ананас", 619);
        Product peach = new SimpleProduct("Персик", 74);
        Product grape = new SimpleProduct("Виноград", 436);
        Product milk = new DiscountedProduct("Молоко", 5, 5);
        Product bread = new DiscountedProduct("Хлеб", 87, 10);
        Product onion = new DiscountedProduct("Лук", 46, 15);
        Product egg = new FixPriceProduct("Яйцо");
        Product water = new FixPriceProduct("Вода");
        Product cabbage = new FixPriceProduct("Капуста");
        Article article1 = new Article("Тест Помада", "Как влияет цвет на ваше настроение?");
        Article article2 = new Article("Тест Молоко", "Какую жирность выбрать для выпечки?");
        Article article3 = new Article("Тест Лампочка", "Определяем мощность.");
        Article article4 = new Article("Покупаем Соль", "");

        SearchEngine searchEngine1 = new SearchEngine(5);
        ProductBasket productBasket1 = new ProductBasket();

        productBasket1.addProduct(banana);
        productBasket1.addProduct(onion);
        productBasket1.addProduct(cabbage);

        searchEngine1.add(article1);
        searchEngine1.add(article2);
        searchEngine1.add(article3);
        searchEngine1.add(pear);
        searchEngine1.add(egg);

        try {
            Product check1 = new SimpleProduct("", 11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена!");
        }

        System.out.println();

        try {
            Product tomato = new DiscountedProduct("Помидор", 0, 25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена!");
        }

        System.out.println();

        searchEngine1.searchElement(Arrays.toString(searchEngine1.search("жир")));

    }

}
