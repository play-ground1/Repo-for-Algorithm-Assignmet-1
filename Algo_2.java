public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;
       
       
        int i=0;
        int min=nums[0];
        int max=nums[0];

        while(i<nums.length){
         
            if (nums[i]>max){
                max=nums[i];    
             
            }   
            if (nums[i]<min){
                min=nums[i];
            }
              i++;
           
            
        }   
         System.out.println("Maximaum number: "+max);
         System.out.println("Minimaum number: "+min);               
    }
    
}
