package org.skypro.skyshop.product;

import java.util.Arrays;

public class SearchEngine {

    private final Searchable[] searchables;
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

    public Searchable[] searchElement(String term) throws BestResultNotFoundException {
        Searchable bestResult = null;

        int found = 0;
        int score;
        for (Searchable item : searchables) {
            String str = item.searchTerm().toLowerCase();
            String subStr = term.toLowerCase();
            score = resultMax(str, subStr);
            if (score > found) {
                found = score;
                bestResult = item;
            }
        }
        if (bestResult == null) {
            throw new BestResultNotFoundException("Нет данных");
        }
        return searchables;

    }

    private int resultMax(String str, String subStr) {
        int score = 0;
        int index = 0;
        int indexSubStr = str.indexOf(subStr, index);
        while (indexSubStr != -1) {
            score++;
            index = indexSubStr + subStr.length();
            indexSubStr = str.indexOf(subStr, index);
        }
        return score;
    }

}
