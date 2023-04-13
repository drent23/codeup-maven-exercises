import org.apache.commons.lang3.StringUtils;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class MavenExer {
    public MavenExer() {
    }
    public static void main(String[] args) {
        System.out.print("Please enter text: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is a number"); ;
        } else {
            System.out.println("\"" + userInput + "\" is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
