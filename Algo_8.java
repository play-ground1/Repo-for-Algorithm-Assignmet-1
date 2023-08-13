public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
   
        int i =0;
       
        String output1="";
        String output2="";

        while(i<numA.length){
            int j = 0;
            while(j<numB.length){
                if (numA[i]==numB[j]){
                     output1 += numA[i] + ",";                
                } 
                    
            
                     j++;  
            }
          
             i++;
        }
            
            System.out.println(output1);    
            System.out.println(output2); 

    }
    
}
