
public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
       // int[] numC = new int[numA.length+numB.length];
   
        int i =0;
       
        String output1="";
        String output2="";
        String output3="";
        String output4="";

        while(i<numA.length){
            boolean search = false;
            int j = 0;
            while(j<numB.length){
                if (numA[i]==numB[j]){
                     output1 += numA[i] + ","; 
                     search=true; 
                     break;                       
                } 
                 j++;
            }
                   
                if (!search){
                    output3 += numA[i] + ",";
                  //  output4 += numB[i] + ",";
                }
            
          output2 += numA[i]+","+numB[i]+",";
          
             i++;
        }
            
            System.out.println(output1);   
            System.out.println(output2); 
            System.out.println(output3); 
          //  System.out.println(output4); 

    }
    
}
