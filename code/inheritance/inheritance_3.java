//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape {
    int getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int length, int breadth) {
        l = length;
        b = breadth;
    }

    int getArea() {
        return l * b;
    }
}

class Main {
    public static void main(String[] args) {

        Shape obj1 = new Shape();
        Rectangle obj2 = new Rectangle(4, 5);

        System.out.println("Area of Square: " + obj1.getArea());
        System.out.println("Area of Rectangle: " + obj2.getArea());
    }
}


/*
 Output:
 Area of Square: 0
 Area of Rectangle: 20
 */