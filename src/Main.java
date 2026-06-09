import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RoomService roomService = new RoomService();
        ReservationManager reservationManager = new ReservationManager();

        boolean running = true;
        while (running) {
            System.out.println("\n=== HOTEL BOOKING SYSTEM ===");
            System.out.println("1. Manage Rooms");
            System.out.println("2. Manage Guests");
            System.out.println("3. Manage Reservations");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: manageRooms(roomService); break;
                case 2: manageGuests(); break;
                case 3: manageReservations(reservationManager); break;
                case 4: running = false; break;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}