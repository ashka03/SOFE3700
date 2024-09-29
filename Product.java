public abstract class Product {
    protected String name;
    protected double price;

    public abstract void setPrice();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
