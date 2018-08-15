/**
 * This class is used if user press 2 in Main Menu - Sell Product.
 * Here in toString method, the program asks the user for some information and based on his choices
 * validates the order first: searches for the product that it exists and if it exists makes sure that it's in stock.
 *
 * @author Cristian S.
 */

package ro.sci.localstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellProduct {
    private String date;
    private boolean reportCreated = false;
    String feedback;

    // create constructor with date
    public SellProduct(String date) {
        this.date = date;
    }

    // create constructor without parameters for toString method
    public SellProduct() {

    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isReportCreated() {
        return reportCreated;
    }

    public void setReportCreated(boolean reportCreated) {
        this.reportCreated = reportCreated;
    }

    // clone lists for animal and vegetable products
    List<AnimalProduct> animalProductsList3 = new ArrayList<AnimalProduct>(new AddProduct().getAnimalProductsList());
    List<VegetableProduct> vegetableProductList3 = new ArrayList<VegetableProduct>(new AddProduct().getVegetableProductsList());

    @Override
    public String toString() {

        //create animal products
        AnimalProduct milk = new AnimalProduct("milk", 9.99, "2020-10-10", 1, 50, 18);
        AnimalProduct eggs = new AnimalProduct("eggs", 7.99, "2028-10-10", 2, 50, 11);
        AnimalProduct cheese = new AnimalProduct("cheese", 27.89, "2022-10-10", 3, 50, 15);
        AnimalProduct yogurt = new AnimalProduct("yogurt", 5.99, "2018-09-10", 4, 15, 15);
        AnimalProduct sourCream = new AnimalProduct("sour cream", 18.99, "2019-09-12", 5, 20, 15);

        // add products to list
        animalProductsList3.add(milk);
        animalProductsList3.add(eggs);
        animalProductsList3.add(cheese);
        animalProductsList3.add(yogurt);
        animalProductsList3.add(sourCream);

        // show animal products to user:
        for (Object element : animalProductsList3) {
            System.out.println(element);
        }

        System.out.println("Enter the product's ID you want to sell and quantity: ");
        Scanner scanner = new Scanner(System.in);

        int idFromUser = scanner.nextInt();
        int quantityToSell = scanner.nextInt();

        // iterate list and find the product to sell
        for (int i = 0; i < animalProductsList3.size(); i++) {
            int stock = animalProductsList3.get(i).getStock();
            String name = animalProductsList3.get(i).getName();
            int id = animalProductsList3.get(i).getProductId();

            if (idFromUser == id) {

                if (stock > quantityToSell) {
                    stock = stock - quantityToSell;
                    feedback = "The new stock for " + name + " is " + stock + ". " + "\n" +
                            "The results are saved in daily sales reports with today's date!";
                    System.out.println(feedback);
                    boolean reportCreated = true;
                } else if (stock == quantityToSell) {
                    animalProductsList3.remove(name);
                    feedback = "Stock zero. Product " + name + " removed from list!" + "\n" +
                            "The results are saved in daily sales reports with today's date!";
                    System.out.println(feedback);
                    boolean reportCreated = true;
                } else {
                    System.out.println("We don't have enough products in stock. Come back later!");
                }
            }
        }
        return "Enter another option: ";
    }
}
