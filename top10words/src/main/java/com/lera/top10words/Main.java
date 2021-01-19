package main.java.com.lera.top10words;

import javafx.util.Pair;

import java.util.*;

public class Main {
    private static final String TEXT = "a b dddd dddd dd ldk ka u i o i o io io io io i i i c d f a ff ff ff ff ff ff ff ff ff ff ff ff ff a d e f j k j k j k j k h h h h h h h h h f f f f f f f f f a a s s s s";

    public static void main(String[] args) {
        Main main = new Main();
        List<Map.Entry<String, Integer>> wordsSorted = main.getWords(TEXT);
        for (int i=0; i<10; i++) {
            System.out.println(wordsSorted.get(i));
        }
    }

    private List<Map.Entry<String, Integer>> getWords(String str) {
        String[] words = str.split(" ");
        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String word: words ) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        return list;
    }


}
