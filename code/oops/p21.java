/*
21. Create a class showing an example of parameterized constructor.
*/

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Sachin", 21);
        s.display();
    }
}

/*
Sample Output:
Name: Sachin
Age: 21
*/
