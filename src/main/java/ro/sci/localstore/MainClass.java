/**
 * This is the main class which displays the menu for the user.
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        DisplayMenu menu = new DisplayMenu();
        // show the menu (toString method of DisplayMenu)
        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        int menuNumber = scanner.nextInt();

        // User chooses an option (if option = 4, then exit the program)
        while (menuNumber != 4) {

            switch (menuNumber) {

                case 1:
                    System.out.println(new AddProduct());

                    break;

                case 2:
                    System.out.println(new SellProduct());

                    break;

                case 3:
                    System.out.println(new SalesReports());
                    break;

                default:
                    System.out.println("There is no " + menuNumber + " option.");
                    break;

            }
            // show the menu (toString method of DisplayMenu)
            System.out.println(menu);
            menuNumber = scanner.nextInt();
        }

    }
}
