import java.util.Scanner;

public class TicketBooking {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name;
        String destination;
        int tickets;

        System.out.print("Enter Passenger Name: ");
        name = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        tickets = sc.nextInt();

        int amount = tickets * 500;

        System.out.println("\n----- Ticket Details -----");
        System.out.println("Passenger : " + name);
        System.out.println("Destination : " + destination);
        System.out.println("Tickets : " + tickets);
        System.out.println("Total Amount : " + amount);
    }
}