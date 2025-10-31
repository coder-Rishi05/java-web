/*
2. Write a Java program to create a class called "Dog" with a name and breed attribute. 
Create two instances of the "Dog" class, set their attributes using the constructor 
and modify the attributes using the setter methods and print the updated values.
*/

class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void display() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rocky", "German Shepherd");
        Dog d2 = new Dog("Bruno", "Labrador");

        System.out.println("Before modification:");
        d1.display();
        d2.display();

        d1.setName("raj");
        d1.setBreed("Bulldog");
        d2.setName("Max");
        d2.setBreed("Pug");

        System.out.println("\nAfter modification:");
        d1.display();
        d2.display();
    }
}

/*
Output:
Before modification:
Dog Name: Rocky, Breed: German Shepherd
Dog Name: Bruno, Breed: Labrador

After modification:
Dog Name: raj, Breed: Bulldog
Dog Name: Max, Breed: Pug
*/
