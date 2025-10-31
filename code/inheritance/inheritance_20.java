// 20. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape


abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

    double calculateSurfaceArea() {
        return 4 * 3.14 * radius * radius;
    }
}

class Cube extends Shape3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double calculateVolume() {
        return side * side * side;
    }

    double calculateSurfaceArea() {
        return 6 * side * side;
    }
}

class Main {
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        Cube c = new Cube(4);

        System.out.println("----- Sphere Details -----");
        System.out.println("Volume of Sphere: " + s.calculateVolume());
        System.out.println("Surface Area of Sphere: " + s.calculateSurfaceArea());

        System.out.println("\n----- Cube Details -----");
        System.out.println("Volume of Cube: " + c.calculateVolume());
        System.out.println("Surface Area of Cube: " + c.calculateSurfaceArea());
    }
}

/* OUTPUT:-
----- Sphere Details -----
Volume of Sphere: 523.3333333333334
Surface Area of Sphere: 314.0
----- Cube Details -----
Volume of Cube: 64.0
Surface Area of Cube: 96.0
*/
