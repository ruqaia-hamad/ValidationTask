import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Enter a customer Name");
        String name = in.nextLine();

        System.out.println("Enter problem description");
        String description = in.nextLine();
        customer.addCustomer(name, description);
        List<String> customers = customer.getCustomersDetails();
        System.out.println("Customer list:");
        for (String x : customers) {

            String[] details = x.split("-");
            System.out.println(details[0] + ": " + details[1]);



        }


    }}