// 6. Create a Java program to create a package with 4 public classes, 
// create the object in another file and call the function created in those classes.

// ===== Step 1: Create a package named mypackage =====

// File: ClassOne.java
package mypackage;

public class ClassOne {
    public void display() {
        System.out.println("This is ClassOne inside package mypackage.");
    }
}

// File: ClassTwo.java
package mypackage;

public class ClassTwo {
    public void display() {
        System.out.println("This is ClassTwo inside package mypackage.");
    }
}

// File: ClassThree.java
package mypackage;

public class ClassThree {
    public void display() {
        System.out.println("This is ClassThree inside package mypackage.");
    }
}

// File: ClassFour.java
package mypackage;

public class ClassFour {
    public void display() {
        System.out.println("This is ClassFour inside package mypackage.");
    }
}


// ===== Step 2: Create another file outside the package to access all four classes =====

// File: TestPackage.java
import mypackage.*;

class TestPackage {
    public static void main(String[] args) {
        ClassOne obj1 = new ClassOne();
        ClassTwo obj2 = new ClassTwo();
        ClassThree obj3 = new ClassThree();
        ClassFour obj4 = new ClassFour();

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}

/*
Output:
This is ClassOne inside package mypackage.
This is ClassTwo inside package mypackage.
This is ClassThree inside package mypackage.
This is ClassFour inside package mypackage.
*/

/*
 Notes:
1. Each class (ClassOne.java, ClassTwo.java, ClassThree.java, ClassFour.java) should be saved 
   inside a folder named "mypackage".
2. Compile the package files using:
      javac -d . ClassOne.java ClassTwo.java ClassThree.java ClassFour.java
3. Then compile and run the TestPackage file:
      javac TestPackage.java
      java TestPackage
*/
