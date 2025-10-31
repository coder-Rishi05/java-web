/*
11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
*/

import java.util.*;

class Library {
    private ArrayList<String> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from the library.");
        } else {
            System.out.println(book + " not found in the library.");
        }
    }

    void showBooks() {
        System.out.println("Books in Library: " + books);
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.addBook("Operating System");

        lib.showBooks();

        lib.removeBook("Data Structures");
        lib.showBooks();
    }
}

/*
Output:
Java Programming added to the library.
Data Structures added to the library.
Operating System added to the library.
Books in Library: [Java Programming, Data Structures, Operating System]
Data Structures removed from the library.
Books in Library: [Java Programming, Operating System]
*/
