import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }

    public List<BuddyInfo> getBuddyList() {
        return buddyList;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}