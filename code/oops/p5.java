/*
5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
and methods to add and remove books from a collection.
*/

import java.util.*;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    void removeBook(String ISBN) {
        boolean removed = false;
        for (Book b : books) {
            if (b.ISBN.equals(ISBN)) {
                books.remove(b);
                System.out.println("Book removed: " + b.title);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    void showBooks() {
        System.out.println("\nCurrent Books in Library:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Programming", "James Gosling", "101");
        Book b2 = new Book("Data Structures", "Robert Lafore", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();

        lib.removeBook("101");
        lib.showBooks();
    }
}

/*
Output:
Book added: Java Programming
Book added: Data Structures

Current Books in Library:
Title: Java Programming, Author: James Gosling, ISBN: 101
Title: Data Structures, Author: Robert Lafore, ISBN: 102
Book removed: Java Programming

Current Books in Library:
Title: Data Structures, Author: Robert Lafore, ISBN: 102
*/
