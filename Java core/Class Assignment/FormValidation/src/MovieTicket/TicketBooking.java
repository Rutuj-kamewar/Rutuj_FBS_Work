package MovieTicket;

import java.util.Scanner;

class MovieBooking {

    static String movieName = "3 Idiots";
    static int ticketPrice = 200;
    static int maxAvailableTickets = 50;

    public static int getRemainingTickets() {
        return maxAvailableTickets;
    }

    public static void bookTickets(int ticketCount)
            throws InvalidTicketNumberException, TicketsSoldOutException {

        if (ticketCount <= 0) {
            throw new InvalidTicketNumberException("❌ Ticket count must be greater than 0!");
        }

        if (ticketCount > maxAvailableTickets) {
            throw new TicketsSoldOutException("❌ Not enough tickets remaining!");
        }

        maxAvailableTickets -= ticketCount;

        // Successful booking
        System.out.println("\n Booking Successful for" + movieName);
        System.out.println("Tickets booked: " + ticketCount);
        System.out.println("Total amount: ₹" + (ticketCount * ticketPrice));
    }
}

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Movie: InterStellar");
        System.out.println("Ticket Price: 200");
        System.out.println("Total Tickets: 50\n");

        while (MovieBooking.getRemainingTickets() > 0) {

            System.out.println("Remaining Tickets: " + MovieBooking.getRemainingTickets());
            System.out.print("Enter number of tickets to book: ");
            int tickets = sc.nextInt();

            try {
                MovieBooking.bookTickets(tickets);
            } 
            catch (InvalidTicketNumberException | TicketsSoldOutException e) {
                System.out.println(e);
            }
        }

        System.out.println("\n Sorry! Tickets are sold out.");
    }
}