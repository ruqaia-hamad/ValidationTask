import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Customer customer=new Customer();
        List<String> problemDescription = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  problem description  OR enter an empty string to stop):");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            problemDescription.add(input);
            input = scanner.nextLine();
        }

        System.out.println("---------------------------");
        for (String x : problemDescription) {
            boolean isValid = customer.validate(x);
            System.out.println(" " + x + ": is " + (isValid ? "valid" : "not valid"));
        }



    }}