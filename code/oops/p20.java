/*
20. Create a class showing an example of default constructor.
*/

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Sachin";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Calls default constructor
        s.display();
    }
}

/*
Sample Output:
Name: Sachin
Age: 20
*/
