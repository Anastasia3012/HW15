package org.skypro.skyshop.product;

import java.util.*;

public class SearchEngine {

    private List<Searchable> searchables;

    public SearchEngine(int size) {
        searchables = new LinkedList<>();
    }

    public void add(Searchable item) {
        searchables.add(item);
    }

    public TreeMap<String, List<Searchable>> search(String term) {
            TreeMap<String, List<Searchable>> result = new TreeMap<>();
        for (Searchable item : searchables) {
            if (item != null && item.searchTerm() != null && item.searchTerm().contains(term)) {
                result.put(item.searchTerm(), (List<Searchable>) item);
            }
        }
        return result;
    }

    public Searchable searchElement(String term) throws BestResultNotFoundException {
        Searchable bestResult = null;
        int found = 0;

        for (Searchable item : searchables) {
            String str = item.searchTerm().toLowerCase();
            String subStr = term.toLowerCase();
            int score = resultMax(str, subStr);
            if (score > found) {
                found = score;
                bestResult = item;
            }
        }
        if (bestResult == null) {
            throw new BestResultNotFoundException("Нет данных");
        }
        return bestResult;
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
