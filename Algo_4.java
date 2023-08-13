import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};
        int i = 0;
        int temp;
       
        while(i<nums.length/2){
        temp=nums[i];
        nums[i] = nums[(nums.length-1)-i];
        nums[(nums.length-1)-i] = temp;
            i++;
        
               
        
        } 
        System.out.println(Arrays.toString(nums));

    }
    
}
