/*
17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews,
and methods for adding and retrieving reviews.
*/

import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    void addActor(String actor) {
        actors.add(actor);
    }

    void addReview(String review) {
        reviews.add(review);
    }

    void getReviews() {
        System.out.println("Reviews for " + title + ":");
        for (String r : reviews) {
            System.out.println("- " + r);
        }
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
    }
}

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");

        movie.addReview("Mind-blowing experience!");
        movie.addReview("A masterpiece of sci-fi cinema.");

        movie.displayInfo();
        movie.getReviews();
    }
}

/*
Sample Output:
Title: Inception
Director: Christopher Nolan
Actors: [Leonardo DiCaprio, Joseph Gordon-Levitt]
Reviews for Inception:
- Mind-blowing experience!
- A masterpiece of sci-fi cinema.
*/
