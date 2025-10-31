/*
28. Write a Java program to create a class called Rectangle with private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables.
*/

class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10.5);
        r.setWidth(5.2);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
    }
}

/*
Sample Output:
Length: 10.5
Width: 5.2
*/
