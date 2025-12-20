package Problem;

import java.util.Arrays;

class Solution3 {
    public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        // for (int i = 0; i < result.length; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         result[i] += nums[j];
        //     }
        // }  
        
        // Can be done in this way
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }
}

public class P3E_Array_L1480 {
    public static void main(String[] args) {

        Solution3 soln = new Solution3();
        int[] nums = {3, 1, 2, 10, 1};
        int[] result = soln.runningSum(nums);
        System.out.println(Arrays.toString(result));
        
    }
}
