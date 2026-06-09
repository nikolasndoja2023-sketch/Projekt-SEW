public class Room {

        private int roomNumber;
        private String roomType;
        private double pricePerNight;
        private int floor;
        private String status;

    public Room(int roomNumber, String roomType, double pricePerNight, int floor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.floor = floor;
        this.status = "AVAILABLE";
    }

    public int getRoomNumber()
    { return roomNumber; }
    public String getRoomType()
    { return roomType; }
    public double getPricePerNight()
    { return pricePerNight; }
    public int getFloor()
    { return floor; }
    public String getStatus()
    { return status; }
    public void setStatus(String status)
    { this.status = status; }

    public void displayInfo() {
        System.out.println("Room " + roomNumber + " | Type: " + roomType +
                " | Price: " + pricePerNight + "€ | Floor: " + floor +
                " | Status: " + status);
    }
    }

