import java.util.Arrays;
import java.util.Scanner;

public class Algo_6 {

    private final static Scanner scanner = new Scanner (System.in);
        public static void main(String[] args) {
        String input="";
      

        do{
                System.out.print("Enter a sentence here: ");
                input = scanner.nextLine().strip();
        } while (input.isBlank());   
        
        String[] sentence = input.split(" ");
        int i=0;
        String temp;
        while (i< sentence.length/2) {
            temp=sentence[i];
            sentence[i]=sentence[sentence.length-1-i];
            sentence[sentence.length-1-i]=temp;
            i++;
        }

        System.out.println(Arrays.toString(sentence));
    }
}
