// 7. Write a Java program to perform employee payroll processing using packages.

// ===== Step 1: Create a package named employee and a class Emp =====
// File: Emp.java
package employee;

import java.util.Scanner;

public class Emp {
    String name, category;
    int empid;
    double bpay, hra, da, allowance, pf, grosspay, incometax, npay;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Category: ");
        category = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        bpay = sc.nextDouble();
    }

    public void calculate() {
        hra = 0.15 * bpay;         // 15% of basic pay
        da = 0.10 * bpay;          // 10% of basic pay
        allowance = 0.05 * bpay;   // 5% of basic pay
        pf = 0.12 * bpay;          // 12% deduction
        grosspay = bpay + hra + da + allowance;
        incometax = 0.10 * grosspay; // 10% income tax
        npay = grosspay - (pf + incometax);
    }

    public void display() {
        System.out.println("\n----- Employee Payroll Details -----");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("PF: " + pf);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Net Pay: " + npay);
    }
}


// ===== Step 2: Create another file outside the package to access Emp class =====
// File: Emppay.java
import employee.Emp;

class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.getData();
        e.calculate();
        e.display();
    }
}

/*
Sample Output:
Enter Employee Name: Sachin
Enter Employee ID: 101
Enter Employee Category: Developer
Enter Basic Pay: 50000

----- Employee Payroll Details -----
Employee Name: Sachin
Employee ID: 101
Category: Developer
Basic Pay: 50000.0
HRA: 7500.0
DA: 5000.0
Allowance: 2500.0
PF: 6000.0
Income Tax: 6500.0
Gross Pay: 65000.0
Net Pay: 52500.0
*/

