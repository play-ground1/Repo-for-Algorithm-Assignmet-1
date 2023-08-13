import java.util.Arrays;
import java.util.Scanner;

public class Algo_5 {

    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        String input="";
do{
        System.out.print("Enter text here: ");
        input = scanner.nextLine().strip();
} while(input.isBlank());          
        char[] chars = input.toCharArray();
        int i=0;
        char temp ;
        while(i<chars.length/2){
            temp = chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]= temp;
            i++;

        }
         System.out.println(Arrays.toString(chars));
     

   

    }
    
}
