public class SingleRoom extends Room {
    private boolean hasBalcony;


    public SingleRoom(int roomNumber, double pricePerNight, int floor, boolean hasBalcony) {
        super(roomNumber, "Single", pricePerNight, floor);
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasBalcony() { return hasBalcony; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Balcony: " + hasBalcony);
    }
}


