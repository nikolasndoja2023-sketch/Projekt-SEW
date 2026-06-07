public class GroupGuest extends Guest {
    private int numberOfPersons;
    private String groupName;

    public GroupGuest(int guestId, String firstName, String lastName, String email, String phone, int numberOfPersons, String groupName) {
        super(guestId, firstName, lastName, email, phone);
        this.numberOfPersons = numberOfPersons;
        this.groupName = groupName;
    }

    public int getNumberOfPersons() { return numberOfPersons; }
    public String getGroupName() { return groupName; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Group: " + groupName + " | Persons: " + numberOfPersons);
    }

}