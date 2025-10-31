/*
24. Create a class showing the area of circle and rectangle by method overloading.
*/

class AreaCalculator {
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        double circleArea = obj.area(5.0);
        double rectangleArea = obj.area(4.0, 6.0);
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

/*
Sample Output:
Area of Circle: 78.53981633974483
Area of Rectangle: 24.0
*/
