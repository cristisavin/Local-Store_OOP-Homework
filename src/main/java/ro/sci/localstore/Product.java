/**
 * This class is a parent class for AnimalProduct and VegetableProduct
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

public abstract class Product {
    private String name;
    private double price;
    private String validityDate;
    private int productId;
    private int stock;

    public Product(String name, double price, String validityDate, int productID, int stock) {
        this.name = name;
        this.price = price;
        this.validityDate = validityDate;
        this.productId = productID;
        this.stock = stock;
    }

    protected Product() {
    }

    // getters and setters:
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


