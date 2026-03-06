package PAKETY_STATIC.homework.task1;

public class Product {

    private String description;
    private int code;
    private double price;

    public Product(String description, int code, double price) {
        this.description = description;
        this.code = code;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description ='" + description + '\'' +
                ", code ='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}