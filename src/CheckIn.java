public class CheckIn {
    private int checkInId;
    private String guestName;
    private int roomNumber;
    private String checkInDate;

    public CheckIn(int checkInId, String guestName, int roomNumber, String checkInDate) {
        this.checkInId = checkInId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
    }

    public int getCheckInId() { return checkInId; }
    public String getGuestName() { return guestName; }
    public int getRoomNumber() { return roomNumber; }
    public String getCheckInDate() { return checkInDate; }

    public void displayInfo() {
        System.out.println("CheckIn ID: " + checkInId +
                " | Guest: " + guestName +
                " | Room: " + roomNumber +
                " | Date: " + checkInDate);
    }

    

}
