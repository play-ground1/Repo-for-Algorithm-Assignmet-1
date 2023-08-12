import java.util.Scanner;

public class Algo_1 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.print("Enter a number:");

            int limit = scanner.nextInt();
            scanner.nextLine();

            if(limit>1){

            int[] FibonacciArray = new int[limit]; //limit-->array size

            FibonacciArray[0]=0;
            FibonacciArray[1]=1;

            int i = 2;
            String output = "";


        
            while(i<limit){

                 FibonacciArray[i]= FibonacciArray[i-1]+ FibonacciArray[i-2];
                 output += FibonacciArray[i] + ",";

                  i++;
    
            }

            System.out.println("Fibonacci sequence up to "+limit+": "+FibonacciArray[0]+","+FibonacciArray[1]+","+ output);
           }
        
            if(limit<0) {  System.out.print("Enter a positive integer");
  
         }
            if(limit==1)System.out.println("Fibonacci sequence up to "+limit+":"+0);
            System.out.println();
        
    }
    
}
