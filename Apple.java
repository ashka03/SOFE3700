import java.lang.String;

public class Apple extends Product {
    public Apple() {
        this.name = "Apple";
    }

    @Override
    public void setPrice() {
        this.price = PriceReader.getPrice("Apple");
    }
}