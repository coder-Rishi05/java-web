/*
3. Write a Java program to create a class called "Rectangle" with width and height attributes. 
Calculate the area and perimeter of the rectangle.
*/

class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.display();
    }
}

/*
Output:
Width: 10.0
Height: 5.0
Area: 50.0
Perimeter: 30.0
*/
