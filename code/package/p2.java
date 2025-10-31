// 2. Create a Java program to access the java.util.Date class through qualified way and print the current date of the system.

class QualifiedDateExample {
    public static void main(String[] args) {
        java.util.Date currentDate = new java.util.Date(); // Accessing Date class using qualified name
        System.out.println("Current Date and Time: " + currentDate);
    }
}

/*
Output:
Current Date and Time: Wed Oct 29 22:32:47 IST 2025
*/
