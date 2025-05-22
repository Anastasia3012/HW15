package org.skypro.skyshop.product;

public class Article implements Searchable {

    private final String nameArticle;
    private final String textArticle;

    public Article(String nameArticle, String textArticle) throws BestResultNotFoundException {
        this.nameArticle = nameArticle;
        this.textArticle = textArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public String getTextArticle() {
        return textArticle;
    }

    @Override
    public String toString() {
        return "Название статьи: " + nameArticle + " Текст статьи: " + textArticle;
    }

    @Override
    public String searchContent() {
        return "ARTICLE";
    }

    @Override
    public String searchTerm() {
        return toString();
    }
}
