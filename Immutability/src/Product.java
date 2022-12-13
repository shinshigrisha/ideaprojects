public class Product {
    private final String name;
    private final String barCode;
    public int price;

    public Product(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }
}
