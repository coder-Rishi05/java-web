// 1. Create a Java program to access the java.util.Date class through import keyword and print the current date of the system.

import java.util.Date;

class CurrentDateExample {
    public static void main(String[] args) {
        Date currentDate = new Date();  // Creating a Date object to get current date and time
        System.out.println("Current Date and Time: " + currentDate);
    }
}

/*
Output:
Current Date and Time: Wed Oct 29 22:30:15 IST 2025
*/
