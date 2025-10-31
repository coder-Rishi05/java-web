// 24. Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.


abstract class Shape2D {
    abstract void draw();
    abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void draw() {
        System.out.println("Drawing a Rectangle of width " + width + " and height " + height);
    }

    void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Resized Rectangle to width " + width + " and height " + height);
    }
}

class Circle extends Shape2D {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    void resize(double factor) {
        radius *= factor;
        System.out.println("Resized Circle to radius " + radius);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);
        Circle c = new Circle(5);

        System.out.println("----- Rectangle -----");
        r.draw();
        r.resize(1.5);

        System.out.println("\n----- Circle -----");
        c.draw();
        c.resize(2);
    }
}


/*
 Output:
 ----- Rectangle -----
 Drawing a Rectangle of width 4.0 and height 6.0
 Resized Rectangle to width 6.0 and height 9.0

 ----- Circle -----
 Drawing a Circle with radius 5.0
 Resized Circle to radius 10.0
 */
