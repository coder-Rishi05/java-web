// 8. Create a Java program to create a package with public class and protected members to be accessed in another class.

// ===== Step 1: Create a package named mypackage and a class with protected members =====
// File: MyClass.java
package mypackage;

public class MyClass {
    protected String message = "Hello from protected member!";
    
    protected void displayMessage() {
        System.out.println(message);
    }
}


// ===== Step 2: Create another class in a different file to access the protected members =====
// File: AccessProtected.java
import mypackage.MyClass;

class SubClass extends MyClass {
    void accessProtected() {
        // Accessing protected member through inheritance
        displayMessage();
    }
}

class AccessProtected {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.accessProtected();
    }
}

/*
Output:
Hello from protected member!
*/

