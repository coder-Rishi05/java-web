// 25. Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.



abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle flies high with strong wings.");
    }

    void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}

class Hawk extends Bird {
    void fly() {
        System.out.println("Hawk soars swiftly and dives to catch prey.");
    }

    void makeSound() {
        System.out.println("Hawk makes a sharp, piercing cry.");
    }
}

class Main {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        Hawk h = new Hawk();

        System.out.println("----- Eagle -----");
        e.fly();
        e.makeSound();

        System.out.println("\n----- Hawk -----");
        h.fly();
        h.makeSound();
    }
}



/*
 Output:
 ----- Eagle -----
 Eagle flies high with strong wings.
 Eagle screeches loudly.

 ----- Hawk -----
 Hawk soars swiftly and dives to catch prey.
 Hawk makes a sharp, piercing cry.
 */