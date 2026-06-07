public class Reservation {
    private int reservationId;
    private String guestName;
    private int roomNumber;
    private String checkInDate;
    private String checkOutDate;
    private String status;

    public Reservation(int reservationId, String guestName, int roomNumber, String checkInDate, String checkOutDate) {
        this.reservationId = reservationId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = "PENDING";
    }

    public int getReservationId() { return reservationId; }
    public String getGuestName() { return guestName; }
    public int getRoomNumber() { return roomNumber; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void displayInfo() {
        System.out.println("Reservation ID: " + reservationId +
                " | Guest: " + guestName +
                " | Room: " + roomNumber +
                " | Check-in: " + checkInDate +
                " | Check-out: " + checkOutDate +
                " | Status: " + status);
    }

}
