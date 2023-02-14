import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Customer {

    List<String> customersDetails = new ArrayList<>();

    public List<String> getCustomersDetails() {
        return customersDetails;
    }

    public static boolean validate(String input) {
        if (input == null || input.isEmpty()) {
            return false; // input is null or empty
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]");
        if (pattern.matcher(input).find()) {
            return false; // input contains special characters
        }

        return true;
    }

    public void addCustomer(String name, String description) {
        if (validate(name) && validate(description)) {
            customersDetails.add(name+"-" +description);
            System.out.println("Customer added to the list.");
        } else {
            System.out.println("Invalid input. Customer not added to the list.");
        }
    }

}
