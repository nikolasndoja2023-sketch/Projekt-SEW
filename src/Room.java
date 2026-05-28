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
    }

