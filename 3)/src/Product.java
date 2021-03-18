public class Product {
    private String name;
    private int price = 1;
    private int rating;
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void printDiscount() {
        System.out.println(price * 0.9);
    }
}
