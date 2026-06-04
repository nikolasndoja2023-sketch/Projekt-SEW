import java.util.ArrayList;

public class RoomService {
    private ArrayList<Room> rooms;

    public RoomService() {
        rooms = new ArrayList<>();
    }
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room " + room.getRoomNumber() + " added!");
    }

    public void removeRoom(int roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomNumber() == roomNumber) {
                rooms.remove(i);
                System.out.println("Room " + roomNumber + " removed!");
                return;
            }
        }
        System.out.println("Room not found!");
    }
    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void displayAllRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available!");
        } else {
            for (Room room : rooms) {
                room.displayInfo();
            }
        }
    }
    public void displayAvailableRooms() {
        for (Room room : rooms) {
            if (room.getStatus().equals("AVAILABLE")) {
                room.displayInfo();
            }
        }
    }

    public void displayRoomsByFloor(int floor) {
        for (Room room : rooms) {
            if (room.getFloor() == floor) {
                room.displayInfo();
            }
        }
    }
}