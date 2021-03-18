public class SubProduct1 extends Product {
    @Override
    public void printDiscount() {
        System.out.println(getPrice() * 0.7);
    }
}
