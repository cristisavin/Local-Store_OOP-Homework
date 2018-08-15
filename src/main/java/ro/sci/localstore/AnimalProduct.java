/**
 * This class is a child of class Product
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

public class AnimalProduct extends Product {
    private int storageTemperature;

    public AnimalProduct(String name, double price, String validityDate, int productID, int stock, int storageTemperature) {
        super(name, price, validityDate, productID, stock);
        this.storageTemperature = storageTemperature;
    }

    @Override
    public String toString() {
        return "Name of product: " + getName() +
                ", ID: " + getProductId() +
                ", Stock: " + getStock();
    }
}





