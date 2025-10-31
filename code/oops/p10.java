/*
10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
and methods to add and remove courses.
*/

import java.util.*;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " added successfully.");
    }

    void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " removed successfully.");
        } else {
            System.out.println(course + " not found in the list.");
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin", "A");
        s1.addCourse("Math");
        s1.addCourse("Java");
        s1.addCourse("DBMS");
        s1.displayInfo();

        s1.removeCourse("Java");
        s1.displayInfo();
    }
}

/*
Output:
Math added successfully.
Java added successfully.
DBMS added successfully.
Name: Sachin
Grade: A
Courses: [Math, Java, DBMS]
Java removed successfully.
Name: Sachin
Grade: A
Courses: [Math, DBMS]
*/
