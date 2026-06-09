import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Reservation> reservations = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== HOTEL BOOKING SYSTEM ===");
            System.out.println("1. Manage Rooms");
            System.out.println("2. Manage Reservations");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: manageRooms(); break;
                case 2: manageReservations(); break;
                case 3: running = false; break;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    public static void manageRooms() {
        System.out.println("\n=== MANAGE ROOMS ===");
        System.out.println("1. Add Room");
        System.out.println("2. Display All Rooms");
        System.out.println("3. Find Room");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Room Number: ");
                int number = scanner.nextInt();
                System.out.print("Floor: ");
                int floor = scanner.nextInt();
                System.out.print("Price per Night: ");
                double price = scanner.nextDouble();
                System.out.println("Type (1=Single 2=Double 3=Suite 4=Family): ");
                int type = scanner.nextInt();
                Room room;
                if (type == 1) {
                    room = new SingleRoom(number, price, floor, false);
                } else if (type == 2) {
                    room = new DoubleRoom(number, price, floor, false);
                } else if (type == 3) {
                    room = new SuitRoom(number, price, floor, 2, false);
                } else {
                    room = new FamilyRoom(number, price, floor, 4, false);
                }
                rooms.add(room);
                System.out.println("Room added!");
                break;
            case 2:
                if (rooms.isEmpty()) {
                    System.out.println("No rooms found!");
                } else {
                    for (Room r : rooms) {
                        r.displayInfo();
                    }
                }
                break;
            case 3:
                System.out.print("Enter Room Number: ");
                int roomNum = scanner.nextInt();
                for (Room r : rooms) {
                    if (r.getRoomNumber() == roomNum) {
                        r.displayInfo();
                        return;
                    }
                }
                System.out.println("Room not found!");
                break;
        }
    }

    public static void manageReservations() {
        System.out.println("\n=== MANAGE RESERVATIONS ===");
        System.out.println("1. Add Reservation");
        System.out.println("2. Display All Reservations");
        System.out.println("3. Cancel Reservation");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Reservation ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Guest Name: ");
                String name = scanner.nextLine();
                System.out.print("Room Number: ");
                int rNum = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Check-in Date: ");
                String checkIn = scanner.nextLine();
                System.out.print("Check-out Date: ");
                String checkOut = scanner.nextLine();
                Reservation res = new Reservation(id, name, rNum, checkIn, checkOut);
                reservations.add(res);
                System.out.println("Reservation added!");
                break;
            case 2:
                if (reservations.isEmpty()) {
                    System.out.println("No reservations found!");
                } else {
                    for (Reservation r : reservations) {
                        r.displayInfo();
                    }
                }
                break;
            case 3:
                System.out.print("Enter Reservation ID: ");
                int resId = scanner.nextInt();
                for (Reservation r : reservations) {
                    if (r.getReservationId() == resId) {
                        r.setStatus("CANCELLED");
                        System.out.println("Reservation cancelled!");
                        return;
                    }
                }
                System.out.println("Reservation not found!");
                break;
        }
    }
}