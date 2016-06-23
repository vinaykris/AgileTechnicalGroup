package example;

/**
 * Created by sduraisamy on 6/18/2016.
 */
public class Product {
    private String productName;
    private String category;
    private double price;
    private String description;

    public Product(String name, String category, double price, String description) {
        this.productName = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
