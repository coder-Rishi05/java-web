/*
6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, 
and methods to calculate and update salary.
*/

class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void updateSalary(double percent) {
        double increase = (salary * percent) / 100;
        salary += increase;
        System.out.println("Salary updated by " + percent + "%");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sachin", "Software Engineer", 50000);
        e1.display();

        e1.updateSalary(10);
        e1.display();
    }
}

/*
Output:
Name: Sachin
Job Title: Software Engineer
Salary: 50000.0
Salary updated by 10.0%
Name: Sachin
Job Title: Software Engineer
Salary: 55000.0
*/
