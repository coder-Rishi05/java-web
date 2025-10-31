// 4. Create a Java program to access the java.util.Date class through qualified way and print the current date of the system but inherit the Date class.

class MyDate extends java.util.Date {
    void displayDate() {
        System.out.println("Current Date and Time: " + this); 
    }
}

class QualifiedInheritDateExample {
    public static void main(String[] args) {
        MyDate dateObj = new MyDate(); 
        dateObj.displayDate();         
    }
}

/*
Output:
Current Date and Time: Wed Oct 29 22:36:33 IST 2025
*/
