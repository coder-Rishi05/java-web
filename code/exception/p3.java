// 3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.

import java.io.*;
import java.util.Scanner;

class a {
    public static void main(String[] args) {
        try {
            File file = new File("abc.txt");  // Trying to open file "abc.txt"
            Scanner Reader = new Scanner(file);

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }

            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);  // Exception will be caught here if file not found
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
Output:
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
*/
