public class BuddyInfo{

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        this.name = "N/A";
        this.address = "N/A";
        this.phoneNumber = "N/A";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args){
        //System.out.println("Hello world!");
        BuddyInfo buddyOne = new BuddyInfo("Homer", "Ottawa, Canada", "613-463-8361");
        System.out.println("Hello " + buddyOne.getName());
    }
}