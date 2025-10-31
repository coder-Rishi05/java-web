// 5. Create a Java program to create a package with multiple default classes.

// Step 1: Create a package named "mypack"
// File: A.java
package mypack;

class A {
    void showA() {
        System.out.println("This is class A inside package mypack.");
    }
}

// File: B.java
package mypack;

class B {
    void showB() {
        System.out.println("This is class B inside package mypack.");
    }
}

// Step 2: Create another file outside the package to access the classes
// File: TestPackage.java
import mypack.*;

class TestPackage {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        
        objA.showA();
        objB.showB();
    }
}

/*
Output:
This is class A inside package mypack.
This is class B inside package mypack.
*/
