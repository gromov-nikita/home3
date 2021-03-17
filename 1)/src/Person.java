public class Person {
    private Address address = new Address();
    private String name;
    private int phoneNumber;
    private String emailAddress;
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void purchaseParkingPass() {
        System.out.println(name + "'s parking pass");
    }
}
