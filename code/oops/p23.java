/*
23. Create a class entering the rollno, name and class of the student from user 
but rollno should be automatically generated as we enter the information of 10 students
*/

import java.util.Scanner;

class Student {
    static int rollCounter = 1; // To auto-generate roll numbers
    int rollno;
    String name;
    String studentClass;

    // Constructor
    Student(String name, String studentClass) {
        this.rollno = rollCounter++;
        this.name = name;
        this.studentClass = studentClass;
    }

    void display() {
        System.out.println("Roll No: " + rollno + "\tName: " + name + "\tClass: " + studentClass);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Class: ");
            String studentClass = sc.nextLine();
            students[i] = new Student(name, studentClass);
            System.out.println();
        }

        System.out.println("\n----- Student Details -----");
        for (Student s : students) {
            s.display();
        }
    }
}

/*
Sample Output:
Enter details for student 1:
Enter Name: Sachin
Enter Class: BCA 3rd Year

----- Student Details -----
Roll No: 1	Name: Sachin	Class: BCA 3rd Year

*/
