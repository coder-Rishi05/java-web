/*
4. Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. Calculate the area and circumference of the circle.
*/

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.display();

        c.setRadius(10);
        System.out.println("\nAfter modifying radius:");
        c.display();
    }
}

/*
Output:
Radius: 7.0
Area: 153.93804002589985
Circumference: 43.982297150257104

After modifying radius:
Radius: 10.0
Area: 314.1592653589793
Circumference: 62.83185307179586
*/
