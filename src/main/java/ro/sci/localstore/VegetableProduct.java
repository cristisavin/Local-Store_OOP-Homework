/**
 * This class is a child of class Product
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

public class VegetableProduct extends Product {
    private String listOfVitamins;

    public VegetableProduct(String name, double price, String validityDate, int productID, int stock, String listOfVitamins) {
        super(name, price, validityDate, productID, stock);
        this.listOfVitamins = listOfVitamins;
    }

    @Override
    public String toString() {
        return "Name of product: " + getName() +
                ", ID: " + getProductId() +
                ", Stock: " + getStock();
    }
}
