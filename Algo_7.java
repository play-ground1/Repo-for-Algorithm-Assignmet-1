import java.util.Scanner;

public class Algo_7 {

    private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        String input="";
    
        do{
        System.out.print("Eneter a sentence: ");

        input = scanner.nextLine().strip();
        }while(input.isBlank());

        String[] sentence = input.split(" ");
        String temp;
        int i =0;
        int max=sentence[0].length();
        int min=sentence[0].length();
        String smallest=sentence[0];
        String longest=sentence[0];

        while(i<sentence.length){
            temp=sentence[i];
            char[] chars = temp.toCharArray();

            if
               (chars.length<min){
                min=chars.length;
                smallest=sentence[i];          
            }
              if
               (chars.length>max){
               max=chars.length;
               longest=sentence[i];                    
            }
            i++;

        }
            System.out.println("The longest word: "+ longest);
            System.out.println("length of the longest word: "+max);

            System.out.println();

            System.out.println("The smallest word: "+smallest);
            System.out.println("length of the smallest word: "+min);
            System.out.println();
        
    }
    
}
