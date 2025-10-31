/*
13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products,
and to check for low inventory.
*/

import java.util.*;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product: " + name + ", Quantity: " + quantity);
    }
}

class Inventory {
    private ArrayList<Product> products;

    Inventory() {
        products = new ArrayList<>();
    }

    void addProduct(String name, int quantity) {
        products.add(new Product(name, quantity));
        System.out.println(name + " added to inventory with quantity " + quantity + ".");
    }

    void removeProduct(String name) {
        Product toRemove = null;
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println(name + " removed from inventory.");
        } else {
            System.out.println(name + " not found in inventory.");
        }
    }

    void checkLowInventory(int threshold) {
        System.out.println("Products below threshold (" + threshold + "):");
        for (Product p : products) {
            if (p.quantity < threshold) {
                p.display();
            }
        }
    }

    void displayAll() {
        System.out.println("----- Inventory List -----");
        for (Product p : products) {
            p.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct("Laptop", 10);
        inv.addProduct("Mouse", 3);
        inv.addProduct("Keyboard", 7);

        inv.displayAll();

        inv.checkLowInventory(5);

        inv.removeProduct("Mouse");
        inv.displayAll();
    }
}

/*
Output:
Laptop added to inventory with quantity 10.
Mouse added to inventory with quantity 3.
Keyboard added to inventory with quantity 7.
----- Inventory List -----
Product: Laptop, Quantity: 10
Product: Mouse, Quantity: 3
Product: Keyboard, Quantity: 7
Products below threshold (5):
Product: Mouse, Quantity: 3
Mouse removed from inventory.
----- Inventory List -----
Product: Laptop, Quantity: 10
Product: Keyboard, Quantity: 7
*/
