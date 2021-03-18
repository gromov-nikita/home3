public class SubProduct3 extends Product {
    @Override
    public void printDiscount() {
        System.out.println(getPrice() * 0.4);
    }
}
