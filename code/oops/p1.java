// 1. Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Sachin", 20);
        Person p2 = new Person("ram", 20);

        p1.display();
        p2.display();
    }
}

/*
Output:
Name: Sachin, Age: 20
Name: ram, Age: 20
*/
