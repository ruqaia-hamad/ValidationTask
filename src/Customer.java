
import java.util.regex.Pattern;

public class Customer {


    public static boolean validate(String input) {
        if (input == null || input.isEmpty()) {
            return false; // input is null or empty
        }

        Pattern pattern = Pattern.compile("[*&^%$#<>]");
        if (pattern.matcher(input).find()) {
            return false; // input contains special characters
        }

        return true;
    }


}
