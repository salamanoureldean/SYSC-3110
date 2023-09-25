//added text to file on github as asked in the lab manual
import java.util.ArrayList;
import java.util.List;

public class AddressBook{
    private ArrayList<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            buddyList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < buddyList.size()){
            return buddyList.remove(index);
        }
        return null;
    }

    public List<BuddyInfo> getBuddyList(){
        return buddyList;
    }

    public String findPhoneNumber(String name){
        for(BuddyInfo buddy: buddyList){
            if(buddy.getName().equals(name)){
                return buddy.getPhoneNumber();
            }
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613-876-9876");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        String number = addressBook.findPhoneNumber("Tom");
        System.out.println(number);
        addressBook.removeBuddy(0);
    }
}
