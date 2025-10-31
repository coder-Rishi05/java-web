/*
19. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.
*/

import java.util.*;

class TravelSystem {
    private List<String> flights;
    private List<String> hotels;
    private List<String> bookings;

    TravelSystem() {
        flights = new ArrayList<>(Arrays.asList("Flight A123 - Delhi to Mumbai", "Flight B456 - Mumbai to Goa", "Flight C789 - Delhi to Bangalore"));
        hotels = new ArrayList<>(Arrays.asList("Hotel Taj", "Hotel Oberoi", "Hotel Paradise"));
        bookings = new ArrayList<>();
    }

    void searchFlights() {
        System.out.println("Available Flights:");
        for (String flight : flights) {
            System.out.println(flight);
        }
    }

    void searchHotels() {
        System.out.println("Available Hotels:");
        for (String hotel : hotels) {
            System.out.println(hotel);
        }
    }

    void bookReservation(String item) {
        bookings.add(item);
        System.out.println("Successfully booked: " + item);
    }

    void cancelReservation(String item) {
        if (bookings.remove(item)) {
            System.out.println("Cancelled reservation: " + item);
        } else {
            System.out.println("No such booking found to cancel.");
        }
    }

    void showBookings() {
        System.out.println("Your Current Bookings:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (String booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TravelSystem t = new TravelSystem();
        t.searchFlights();
        t.searchHotels();

        t.bookReservation("Flight A123 - Delhi to Mumbai");
        t.bookReservation("Hotel Taj");

        t.showBookings();

        t.cancelReservation("Hotel Taj");
        t.showBookings();
    }
}

/*
Sample Output:
Available Flights:
Flight A123 - Delhi to Mumbai
Flight B456 - Mumbai to Goa
Flight C789 - Delhi to Bangalore
Available Hotels:
Hotel Taj
Hotel Oberoi
Hotel Paradise
Successfully booked: Flight A123 - Delhi to Mumbai
Successfully booked: Hotel Taj
Your Current Bookings:
Flight A123 - Delhi to Mumbai
Hotel Taj
Cancelled reservation: Hotel Taj
Your Current Bookings:
Flight A123 - Delhi to Mumbai
*/
