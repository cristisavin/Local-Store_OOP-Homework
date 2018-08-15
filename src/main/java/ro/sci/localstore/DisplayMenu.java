/**
 * This is the the menu displayed for the user, in the main class.
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

public class DisplayMenu {
    @Override
    public String toString() {

        return "---------------------------------------" + "\n" +
                "1. Create product and add it to stock." + "\n" +
                "2. Sell product" + "\n" +
                "3. Display daily sales report" + "\n" +
                "4. Exit" + "\n" +
                "Choose an option:" + "\n" +
                "---------------------------------------";
    }
}
