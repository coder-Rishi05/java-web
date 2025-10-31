// 30. Program to find the number of the words in the given text file

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        int wordCount = 0;

        while (sc.hasNext()) {
            sc.next();
            wordCount++;
        }
        sc.close();

        System.out.println("Total number of words in the file: " + wordCount);
    }
}

/*
 * Example (if input.txt contains):
 * "This is the best season of the year and the best time."
 *
 * Output:
 * Total number of words in the file: 12
 */
