import java.util.Arrays;
import java.util.Scanner;

public class Algo_5 {

    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
do{
        System.out.print("Enter text here: ");


        String input = scanner.nextLine().strip();
        if(input=="")System.out.println("Invalid input");
        else{
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
     
     } while(true);   

    }
    
}
