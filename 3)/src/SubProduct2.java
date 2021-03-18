public class SubProduct2 extends Product {
    @Override
    public void printDiscount() {
        System.out.println(getPrice() * 0.3);
    }
}
