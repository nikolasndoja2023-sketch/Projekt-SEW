public class FamilyRoom extends Room {
    private int maxPersons;
    private boolean hasKitchen;
    public FamilyRoom(int roomNumber, double pricePerNight, int floor, int maxPersons, boolean hasKitchen) {
        super(roomNumber, "Family", pricePerNight, floor);
        this.maxPersons = maxPersons;
        this.hasKitchen = hasKitchen;
    }
    public int getMaxPersons() { return maxPersons; }
    public boolean isHasKitchen() { return hasKitchen; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max Persons: " + maxPersons + " | Kitchen: " + hasKitchen);
    }
}