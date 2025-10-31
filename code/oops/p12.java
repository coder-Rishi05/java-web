/*
12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes,
and methods to check flight status and delay.
*/

import java.time.*;

class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;

    Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    void checkStatus() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isBefore(departureTime)) {
            System.out.println("Flight " + flightNumber + " is on time and will depart at " + departureTime + ".");
        } else {
            System.out.println("Flight " + flightNumber + " has already departed or is delayed.");
        }
    }

    void delayFlight(int minutes) {
        departureTime = departureTime.plusMinutes(minutes);
        System.out.println("Flight " + flightNumber + " delayed by " + minutes + " minutes. New departure time: " + departureTime);
    }

    void displayInfo() {
        System.out.println("Flight No: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
    }
}

public class Main {
    public static void main(String[] args) {
        Airplane flight = new Airplane("AI202", "Delhi", LocalTime.of(14, 30));
        flight.displayInfo();
        flight.checkStatus();
        flight.delayFlight(45);
        flight.checkStatus();
    }
}

/*
Output:
Flight No: AI202
Destination: Delhi
Departure Time: 14:30
Flight AI202 is on time and will depart at 14:30.
Flight AI202 delayed by 45 minutes. New departure time: 15:15
Flight AI202 is on time and will depart at 15:15.
*/
