// 3. Create a Java program to access the java.util.Date class through import keyword and print the current date of the system but inherit the Date class.

import java.util.Date;

class MyDate extends Date {
    void displayDate() {
        System.out.println("Current Date and Time: " + this); 
    }
}

class InheritDateExample {
    public static void main(String[] args) {
        MyDate dateObj = new MyDate(); 
        dateObj.displayDate();         
}

/*
Output:
Current Date and Time: Wed Oct 29 22:34:51 IST 2025
*/
