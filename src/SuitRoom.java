public class SuitRoom extends Room {
    private int numberOfRooms;
    private boolean hasJacuzzi;

    public SuitRoom(int roomNumber, double pricePerNight, int floor, int numberOfRooms, boolean hasJacuzzi) {
        super(roomNumber, "Suite", pricePerNight, floor);
        this.numberOfRooms = numberOfRooms;
        this.hasJacuzzi = hasJacuzzi;
    }
    public int getNumberOfRooms() { return numberOfRooms; }
    public boolean isHasJacuzzi() { return hasJacuzzi; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rooms: " + numberOfRooms + " | Jacuzzi: " + hasJacuzzi);
    }
}