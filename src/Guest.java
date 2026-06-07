public class Guest {
    private int guestId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

public Guest(int guestId, String firstName, String lastName, String email, String phone) {
    this.guestId = guestId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
}

public int getGuestId() { return guestId; }
public String getFirstName() { return firstName; }
public String getLastName() { return lastName; }
public String getEmail() { return email; }
public String getPhone() { return phone; }

public void displayInfo() {
    System.out.println("Guest ID: " + guestId +
            " | Name: " + firstName + " " + lastName +
            " | Email: " + email +
            " | Phone: " + phone);
}}
