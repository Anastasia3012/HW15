package org.skypro.skyshop.product;

import java.util.Arrays;

public class SearchEngine {

    private Searchable[] searchables;
    private int count = 0;

    public SearchEngine(int size) {
        searchables = new Searchable[size];
    }

    public void add(Searchable item) {
        if (count < searchables.length) {
            searchables[count++] = item;
        }
    }

    public Searchable[] search(String term) {
        Searchable[] arr = new Searchable[5];
        int resultCount = 0;

        for (Searchable item : searchables) {
            if (item != null && item.searchTerm().contains(term)) {
                if (resultCount < 5) {
                    arr[resultCount++] = item;
                } else {
                    break;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }


}
