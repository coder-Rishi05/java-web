/*
30. Write a Java program to create a class called Circle with a private instance variable radius. 
Provide public getter and setter methods to access and modify the radius variable. 
However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
*/

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5.0);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
    }
}

/*
Sample Output:
Radius: 5.0
Area: 78.53981633974483
Perimeter: 31.41592653589793
*/
