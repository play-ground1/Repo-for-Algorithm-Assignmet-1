import java.util.Arrays;
import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        String input;

        do{
            System.out.print("Enter a word: ");

            input = scanner.nextLine();

            if (input.contains(" ")) {
                System.out.println("Please enter a single word.");
            }
        } while (input.contains(" "));

            char[] chars = input.toCharArray();
            char[] chars2 =new char[chars.length];
            int i=0;

            while(i<chars.length/2){
           
                if(chars[i]==chars[chars.length-1-i]){
                    chars2[i]=chars[chars.length-1-i];
             }
                  i++;             
            }
                if(Arrays.equals(chars,chars2)){
                System.out.println("The word is a palindrome");
                
            } else {
                System.out.println("The word is not a palindrome");
            }      
        
    }

}
