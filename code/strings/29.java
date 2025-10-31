// 29. Program to find the most repeated word in a text file

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        Map<String, Integer> map = new HashMap<>();

        while (sc.hasNext()) {
            String word = sc.next().toLowerCase().replaceAll("[^a-z]", "");
            if (word.isEmpty())
                continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        sc.close();

        String maxWord = "";
        int maxCount = 0;
        for (String w : map.keySet()) {
            if (map.get(w) > maxCount) {
                maxCount = map.get(w);
                maxWord = w;
            }
        }

        System.out.println("Most repeated word: " + maxWord);
        System.out.println("Frequency: " + maxCount);
    }
}

/*
 * Example (if input.txt contains):
 * "This is the best season of the year and the best time."
 *
 * Output:
 * Most repeated word: the
 * Frequency: 3
 */
