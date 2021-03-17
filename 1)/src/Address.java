 public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private int postalCode;
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public void validate(boolean bool) {
        System.out.println("Validate: " + bool);
    }
    public void outputAsLabel() {
        System.out.println(country + " " + state + " " + city + " " + street + " " + postalCode);
    }
}
