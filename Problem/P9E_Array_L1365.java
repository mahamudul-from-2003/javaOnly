package Problem;

import java.util.Arrays;

class Solution9 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                } 
            }
            result[i] = count;
        }


        // AI Generated 
        // int[] count = new int[102];
        // int n = nums.length;
        
        // // Count frequency
        // for (int num : nums) {
        //     count[num + 1]++;
        // }
        
        // // Calculate prefix sum
        // for (int i = 1; i < 102; i++) {
        //     count[i] += count[i - 1];
        // }
        
        // int[] result = new int[n];
        // for (int i = 0; i < n; i++) {
        //     result[i] = count[nums[i]]; // Direct access, no condition check
        // }


        return result;
    }
}

public class P9E_Array_L1365 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = new Solution9().smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}
