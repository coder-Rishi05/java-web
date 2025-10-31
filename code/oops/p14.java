/*
14. Write a Java program to create a class called "School" with attributes for students, teachers, and classes,
and methods to add and remove students and teachers, and to create classes.
*/

import java.util.*;

class School {
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    void addStudent(String student) {
        students.add(student);
        System.out.println(student + " added as a student.");
    }

    void removeStudent(String student) {
        if (students.remove(student)) {
            System.out.println(student + " removed from students list.");
        } else {
            System.out.println(student + " not found in students list.");
        }
    }

    void addTeacher(String teacher) {
        teachers.add(teacher);
        System.out.println(teacher + " added as a teacher.");
    }

    void removeTeacher(String teacher) {
        if (teachers.remove(teacher)) {
            System.out.println(teacher + " removed from teachers list.");
        } else {
            System.out.println(teacher + " not found in teachers list.");
        }
    }

    void createClass(String className) {
        classes.add(className);
        System.out.println("Class " + className + " created successfully.");
    }

    void showDetails() {
        System.out.println("\n--- School Details ---");
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Sachin");
        school.addStudent("Komal");
        school.addTeacher("Mr. Sharma");
        school.addTeacher("Mrs. Kaur");
        school.createClass("10th Grade");
        school.createClass("12th Grade");

        school.showDetails();

        school.removeStudent("Komal");
        school.removeTeacher("Mr. Sharma");

        school.showDetails();
    }
}

/*
Output:
Sachin added as a student.
Komal added as a student.
Mr. Sharma added as a teacher.
Mrs. Kaur added as a teacher.
Class 10th Grade created successfully.
Class 12th Grade created successfully.

--- School Details ---
Students: [Sachin, Komal]
Teachers: [Mr. Sharma, Mrs. Kaur]
Classes: [10th Grade, 12th Grade]
Komal removed from students list.
Mr. Sharma removed from teachers list.

--- School Details ---
Students: [Sachin]
Teachers: [Mrs. Kaur]
Classes: [10th Grade, 12th Grade]
*/
