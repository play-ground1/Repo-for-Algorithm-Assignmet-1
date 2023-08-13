import java.util.Scanner;

public class Algo_10 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    String input;
        do {
            System.out.print("Enter the Tele Phone number: ");
            input = scanner.nextLine();

            if (input.isBlank()) {
                System.out.println("Telephone number can't be empty. Please enter phone number again.");
                continue;
                 }
        } while (input.isBlank());

        char[] chars = input.toCharArray();

        if (chars.length == 14 && input.startsWith("+94 ") && chars[6] == ' ' && chars[10] == ' ') {

            boolean valid = true;
            for (int i = 4; i < chars.length; i++) {
                if (i == 6 || i == 10) {
                    if (chars[i] != ' ') {
                        valid = false;
                        break;
                    }
                } else if (!Character.isDigit(chars[i])) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println("Number is valid.");
            } else {
                System.out.println("Number is not valid.");
            }
        } else if (chars.length == 11 && input.startsWith("0") && chars[3] == '-') {

            boolean valid = true;

            for (int i = 1; i < chars.length; i++) {
              if (i == 3) {
                if (chars[i] != '-') {
                valid = false;
                break;

                }
                } else if (!Character.isDigit(chars[i])) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                System.out.println("Number is valid.");
            } else {
                System.out.println("Number is not valid.");
                }
            } 
             else {
                System.out.println("Number is not valid.");
      }
    }
}


