public class TestGroceryStore {

    public static void main(String[] args) {

        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProductFactory appleFactory = new AppleFactory();

        Product banana = bananaFactory.createProduct();
        Product apple = appleFactory.createProduct();

        System.out.println(banana.getName() + " price: $" + banana.getPrice());
        System.out.println(apple.getName() + " price: $" + apple.getPrice());
    }
}
