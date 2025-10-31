/*
8. Write a Java program to create class called "TrafficLight" with attributes for color and duration,
and methods to change the color and check for red or green.
*/

class TrafficLight {
    private String color;
    private int duration;

    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }

    void checkLight() {
        if (color.equalsIgnoreCase("red")) {
            System.out.println("STOP! The light is red.");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("GO! The light is green.");
        } else {
            System.out.println("WAIT! The light is yellow.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.checkLight();

        light.changeColor("Green", 40);
        light.checkLight();

        light.changeColor("Yellow", 5);
        light.checkLight();
    }
}

/*
Output:
STOP! The light is red.
Traffic light changed to Green for 40 seconds.
GO! The light is green.
Traffic light changed to Yellow for 5 seconds.
WAIT! The light is yellow.
*/
