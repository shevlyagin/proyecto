package PAKETY_STATIC.homework.almacen;

public class Product {

    private int code;
    private String description;
    private double price;

    public Product(int code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public double calculateSurcharge() {
        return price * 0.05;
    }

    public double calculateVAT() {
        return price * 0.21;
    }

    public double calculateFinalPrice() {
        return price + calculateSurcharge() + calculateVAT();
    }

    public void showProduct() {
        System.out.println("Product: " + description + " (code: " + code + ")");
        System.out.println("Base price: " + price + " €");
        System.out.println("Surcharge (5%): " + calculateSurcharge() + " €");
        System.out.println("VAT (21%): " + calculateVAT() + " €");
        System.out.println("Final price: " + calculateFinalPrice() + " €");
    }
}