// 22. Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    void eat() {
        System.out.println("Athlete eats a healthy diet full of proteins and vitamins.");
    }

    void exercise() {
        System.out.println("Athlete exercises daily with running and gym workouts.");
    }
}

class LazyPerson extends Person {
    void eat() {
        System.out.println("Lazy person eats junk food and snacks all day.");
    }

    void exercise() {
        System.out.println("Lazy person prefers sleeping instead of exercising.");
    }
}

class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        LazyPerson l = new LazyPerson();

        System.out.println("----- Athlete -----");
        a.eat();
        a.exercise();

        System.out.println("\n----- Lazy Person -----");
        l.eat();
        l.exercise();
    }
}

/* OUTPUT:-

 ----- Athlete -----
    Athlete eats a healthy diet full of proteins and vitamins.
    Athlete exercises daily with running and gym workouts.
    ----- Lazy Person -----
    Lazy person eats junk food and snacks all day.
    Lazy person prefers sleeping instead of exercising.
    */
   