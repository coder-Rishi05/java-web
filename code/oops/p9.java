/*
9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
and a method to calculate years of service.
*/

import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sachin", 55000, LocalDate.of(2018, 5, 15));
        emp1.display();
    }
}

/*
Output:
Name: Sachin
Salary: 55000.0
Hire Date: 2018-05-15
Years of Service: 7
*/
