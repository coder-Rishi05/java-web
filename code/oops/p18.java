/*
18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings,
and methods to add and remove items, and to calculate average rating.
*/

import java.util.*;

class Restaurant {
    private Map<String, Double> menu;
    private List<Integer> ratings;

    Restaurant() {
        menu = new HashMap<>();
        ratings = new ArrayList<>();
    }

    void addItem(String item, double price) {
        menu.put(item, price);
        System.out.println(item + " added to the menu.");
    }

    void removeItem(String item) {
        if (menu.containsKey(item)) {
            menu.remove(item);
            System.out.println(item + " removed from the menu.");
        } else {
            System.out.println("Item not found in the menu.");
        }
    }

    void showMenu() {
        System.out.println("------ Menu ------");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - ₹" + entry.getValue());
        }
    }

    void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
            System.out.println("Rating " + rating + " added.");
        } else {
            System.out.println("Rating should be between 1 and 5.");
        }
    }

    void calculateAverageRating() {
        if (ratings.isEmpty()) {
            System.out.println("No ratings yet.");
            return;
        }
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        double avg = sum / ratings.size();
        System.out.println("Average Rating: " + avg);
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.addItem("Burger", 120);
        r.addItem("Pizza", 250);
        r.addItem("Pasta", 180);
        r.showMenu();

        r.addRating(5);
        r.addRating(4);
        r.addRating(3);
        r.calculateAverageRating();

        r.removeItem("Pasta");
        r.showMenu();
    }
}

/*
Sample Output:
Burger added to the menu.
Pizza added to the menu.
Pasta added to the menu.
------ Menu ------
Burger - ₹120.0
Pizza - ₹250.0
Pasta - ₹180.0
Rating 5 added.
Rating 4 added.
Rating 3 added.
Average Rating: 4.0
Pasta removed from the menu.
------ Menu ------
Burger - ₹120.0
Pizza - ₹250.0
*/
