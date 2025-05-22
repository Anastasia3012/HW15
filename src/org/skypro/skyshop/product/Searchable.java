package org.skypro.skyshop.product;

public interface Searchable {

    String searchTerm();

    String searchContent();

    default String getStringRepresentation() {
        return searchTerm() + " " + searchContent();
    }
}
