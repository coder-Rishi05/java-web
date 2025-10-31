// 10. Create a Java program to create a package with public class and public members to be accessed in another class.

// ===== Step 1: Create a package named mypackage and a class with public members =====
// File: PublicClass.java
package mypackage;

public class PublicClass {
    public String message = "Hello from a public member inside package mypackage!";

    public void displayMessage() {
        System.out.println(message);
    }
}


// ===== Step 2: Create another file outside the package to access public members =====
// File: AccessPublic.java
import mypackage.PublicClass;

class AccessPublic {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();  // Direct access since members are public
        obj.displayMessage();                 // Calling public method
        System.out.println("Accessed directly: " + obj.message); // Accessing public variable directly
    }
}

/*
Output:
Hello from a public member inside package mypackage!
Accessed directly: Hello from a public member inside package mypackage!
*/


