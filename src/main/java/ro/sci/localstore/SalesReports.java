/**
 * This class is used if user press 3 in Main Menu - Display daily sales report.
 * Here is Override the toString method, a validate data format method (isValidDate), and a method that creates a
 * selling report based on a given date (by the user)
 *
 * @author Cristian S.
 */
package ro.sci.localstore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SalesReports {

    public SalesReports() {
    }

    @Override
    public String toString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date for the sales report in a valid format (yyyy-MM-dd): ");
        String date = scanner.next();
        createSellingReport(date);
        return "Enter another choice: ";
    }

    // method to validate date format
    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public String createSellingReport(String date) {

        SellProduct product = new SellProduct(date);

        if (isValidDate(date)) {
            if (product.isReportCreated() == true) {
                System.out.println("In " + date + " was generated the following feedback: \n" + product.getFeedback());

            } else {
                System.out.println("There are no sales in " + date);
            }
        } else {
            System.out.println("Invalid data format!");
        }

        return "End of Sales Report!";
    }
}
