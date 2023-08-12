import java.util.Arrays;

public class Algo_3 {

    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

       // System.out.println(Arrays.toString(nums));
        int i=0;
        
        int[] nums2 =new int[nums.length];
        while(i<nums.length){
            
            nums2[i]=nums[(nums.length-1)-i];
            
            i++;
        }
        nums=nums2;
        System.out.println(Arrays.toString(nums));
    }
    
}
