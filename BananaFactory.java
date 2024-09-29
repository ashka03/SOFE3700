public class BananaFactory implements GroceryProductFactory {
    @Override
    public Product createProduct() {
        Product banana = new Banana();
        banana.setPrice();
        return banana;
    }
}