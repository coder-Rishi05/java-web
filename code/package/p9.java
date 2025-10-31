// 9. Create a Java program to create a nested package i.e. c4.sample 
// with public class and protected members to be accessed in another class.

// ===== Step 1: Create a nested package named c4.sample and a class with protected members =====
// File: MessageClass.java
package c4.sample;

public class MessageClass {
    protected String msg = "Hello from protected member inside nested package c4.sample!";

    protected void showMessage() {
        System.out.println(msg);
    }
}


// ===== Step 2: Create another file outside the package to access protected members =====
// File: AccessNestedPackage.java
import c4.sample.MessageClass;

class SubMessage extends MessageClass {
    void accessProtected() {
        // Accessing protected members through inheritance
        showMessage();
    }
}

class AccessNestedPackage {
    public static void main(String[] args) {
        SubMessage obj = new SubMessage();
        obj.accessProtected();
    }
}

/*
Output:
Hello from protected member inside nested package c4.sample!
*/

