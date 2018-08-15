/**
 * This class has the following methods:
 * toString - Override;
 * menuChoice() -  decides what type of product to create based on input decision
 * addAnimalProduct() - instantiate AnimalProduct Class - create a product and add it to the List
 * addVegetableProduct() - instantiate VegetableProduct Class - create a product and add it to the List
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddProduct {
    Scanner scanner = new Scanner(System.in);

    // create lists for animal and vegetable products
    List<AnimalProduct> animalProductsList = new ArrayList<AnimalProduct>();
    List<VegetableProduct> vegetableProductsList = new ArrayList<VegetableProduct>();

    public List<AnimalProduct> getAnimalProductsList() {
        return animalProductsList;
    }

    public List<VegetableProduct> getVegetableProductsList() {
        return vegetableProductsList;
    }

    public void setAnimalProductsList(List<AnimalProduct> animalProductsList) {
        for (AnimalProduct element : animalProductsList) {
            animalProductsList.add(element);
        }
    }

    public void setVegetableProductsList(List<VegetableProduct> vegetableProductsList) {
        for (VegetableProduct element : vegetableProductsList) {
            vegetableProductsList.add(element);
        }
    }

    @Override
    public String toString() {
        System.out.println("-------------------------" + "\n" +
                "1-animal;   2-vegetable;" + "\n" +
                "-------------------------" + "\n");
        return menuChoice();

    }

    private String menuChoice() {
        int choice = scanner.nextInt();
        if (choice == 1) {
            addAnimalProduct();
            return "Animal Product was added to stock!" + "\n Enter another option: ";
        } else if (choice == 2) {
            addVegetableProduct();
            return "Vegetable Product was added to stock!" + "\n Enter another option: ";
        } else {
            return choice + " is not a valid option!";
        }
    }

    private String addAnimalProduct() {
        // user input name of the product:
        System.out.println("Enter the name of the product: ");
        String name = scanner.next();

        // user input ID of the product:
        System.out.println("Enter the product ID: ");
        int productID = scanner.nextInt();

        // user input price
        System.out.println("Enter the price for the product " + name + ": ");
        double price = scanner.nextDouble();

        // user input validity date in a valid format
        System.out.println("Enter the expiration date for the product in the following format: yyyy-MM-dd: ");
        String validityDate = scanner.next();

        // user input stock quantity
        System.out.println("Enter the stock quantity: ");
        int stock = scanner.nextInt();

        // user input storage temperature:
        System.out.println("Enter the storage temperature in Celsius degrees: ");
        int storageTemperature = scanner.nextInt();

        // create new animal product
        AnimalProduct animalProduct = new AnimalProduct(name, price, validityDate, productID, stock, storageTemperature);

        // add product to list:
        animalProductsList.add(animalProduct);

        showAnimalProducts();

        //return confirmation to user
        return "Animal Product was added to stock!";
    }

    private String addVegetableProduct() {
        // user input name of the product:
        System.out.println("Enter the name of the product: ");
        String name = scanner.next();

        // user input ID of the product:
        System.out.println("Enter the product ID: ");
        int productID = scanner.nextInt();

        // user input price
        System.out.println("Enter the price for the product " + name + ": ");
        double price = scanner.nextDouble();

        // user input validity date in a valid format
        System.out.println("Enter the expiration date for the product in the following format: yyyy-MM-dd: ");
        String validityDate = scanner.next();

        // user input stock quantity
        System.out.println("Enter the stock quantity: ");
        int stock = scanner.nextInt();

        // user input list of Vitamins:
        System.out.println("Enter the list of Vitamins for this product: ");
        String listOfVitamins = scanner.next();

        // create new animal product
        VegetableProduct vegetableProduct = new VegetableProduct(name, price, validityDate, productID, stock, listOfVitamins);

        // add product to list
        vegetableProductsList.add(vegetableProduct);

        //return confirmation to user
        return "Vegetable Product was added to stock!";
    }

    public void showAnimalProducts() {
        // show animal products to user:
        for (Object element : animalProductsList) {
            System.out.println(element);
        }
    }
}
