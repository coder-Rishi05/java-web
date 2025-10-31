/*
22. Create a class showing an example of copy constructor.
*/

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin", 21);
        Student s2 = new Student(s1); // Using copy constructor

        System.out.println("Original Object:");
        s1.display();

        System.out.println("\nCopied Object:");
        s2.display();
    }
}

/*
Sample Output:
Original Object:
Name: Sachin
Age: 21

Copied Object:
Name: Sachin
Age: 21
*/
