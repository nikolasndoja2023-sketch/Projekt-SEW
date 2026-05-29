public class DoubleRoom extends Room {
    private boolean hasSeaView;

    public DoubleRoom(int roomNumber, double pricePerNight, int floor, boolean hasSeaView) {
        super(roomNumber, "Double", pricePerNight, floor);
        this.hasSeaView = hasSeaView;
    }
    public boolean isHasSeaView() { return hasSeaView; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sea View: " + hasSeaView);
    }
}
