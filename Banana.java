public class Banana extends Product {
    public Banana() {
        this.name = "Banana";
    }

    @Override
    public void setPrice() {
        this.price = PriceReader.getPrice("Banana");
    }
}