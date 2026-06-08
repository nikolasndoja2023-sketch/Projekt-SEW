import java.util.ArrayList;

public class ReservationManager {
    private ArrayList<Reservation> reservations;

    public ReservationManager() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        System.out.println("Reservation " + reservation.getReservationId() + " added!");
    }

    public void cancelReservation(int reservationId) {
        for (Reservation r : reservations) {
            if (r.getReservationId() == reservationId) {
                r.setStatus("CANCELLED");
                System.out.println("Reservation " + reservationId + " cancelled!");
                return;
            }
        }
        System.out.println("Reservation not found!");
    }

    public Reservation findReservation(int reservationId) {
        for (Reservation r : reservations) {
            if (r.getReservationId() == reservationId) {
                return r;
            }
        }
        return null;
    }

    public void displayAllReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found!");
        } else {
            for (Reservation r : reservations) {
                r.displayInfo();
            }
        }
    }

    public void displayReservationsByGuest(String guestName) {
        for (Reservation r : reservations) {
            if (r.getGuestName().equals(guestName)) {
                r.displayInfo();
            }
        }
    }

    public void displayReservationsByStatus(String status) {
        for (Reservation r : reservations) {
            if (r.getStatus().equals(status)) {
                r.displayInfo();
            }
        }
    }


}