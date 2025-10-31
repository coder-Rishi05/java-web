// 16. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.



abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Circle subclass
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    int side1, side2, side3, height, base;

    Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        Triangle t = new Triangle(6, 4, 5, 6, 7);
        System.out.println("Triangle Area: " + t.calculateArea());
        System.out.println("Triangle Perimeter: " + t.calculatePerimeter());
    }
}


/*
 Output:
 Circle Area: 78.5
 Circle Perimeter: 31.400000000000002
 Triangle Area: 12.0
 Triangle Perimeter: 18.0
 */