public class Runner {
    public static void main(String[] args) {
        Product[] array = new Product[5];
        array[0] = new Product();
        array[1] = new SubProduct1();
        array[2] = new SubProduct2();
        array[3] = new SubProduct3();
        array[4] = new SubProduct1();
        for(int i = 0; i < 5; i++) {
            array[i].printDiscount();
        }

    }
}
