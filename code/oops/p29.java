/*
29. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. 
Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
*/

class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public String getEmployeeSalary() {
        return String.format("₹%.2f", employee_salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(101);
        e.setEmployeeName("Sachin");
        e.setEmployeeSalary(55000.75);

        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Employee Name: " + e.getEmployeeName());
        System.out.println("Employee Salary: " + e.getEmployeeSalary());
    }
}

/*
Sample Output:
Employee ID: 101
Employee Name: Sachin
Employee Salary: ₹55000.75
*/
