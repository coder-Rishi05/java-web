/*
32. Write a Java program to create a class called Student with private instance variables 
student_id, student_name, and grades. Provide public getter and setter methods to access 
and modify the student_id and student_name variables. However, provide a method called 
addGrade() that allows adding a grade to the grades variable while performing additional validation.
*/

import java.util.ArrayList;

class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade! Please enter a value between 0 and 100.");
        }
    }

    public void displayGrades() {
        System.out.println("Grades of " + student_name + ": " + grades);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");

        s1.addGrade(85);
        s1.addGrade(92);
        s1.addGrade(110); // invalid
        s1.displayGrades();
    }
}

/*
Sample Output:
Grade 85 added successfully.
Grade 92 added successfully.
Invalid grade! Please enter a value between 0 and 100.
Grades of Rahul: [85, 92]
*/
