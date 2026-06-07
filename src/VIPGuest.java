public class VIPGuest extends Guest {
    private double discountPercent;

public VIPGuest(int guestId, String firstName, String lastName, String email, String phone, double discountPercent) {
    super(guestId, firstName, lastName, email, phone);
    this.discountPercent = discountPercent;
}
public double getDiscountPercent() { return discountPercent; }

public void displayInfo() {
    super.displayInfo();
    System.out.println("VIP Discount: " + discountPercent + "%");
}}