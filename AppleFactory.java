public class AppleFactory implements GroceryProductFactory {
    @Override
    public Product createProduct() {
        Product apple = new Apple();
        apple.setPrice();
        return apple;
    }
}