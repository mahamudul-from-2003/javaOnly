package Problem;

import java.util.Arrays;

class Solution5 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[j];
            } else {
                result[i] = nums[n + j];
                j++;
            }
        }

        // can be done in this way too
        // for (int i = 0, j = 0; i < n; i++, j += 2) {
        // result[j] = nums[i];
        // result[j + 1] = nums[n + i];
        // }
        
        return result;
    }
}

public class P5E_Array_L1470 {
    public static void main(String[] args) {
        // Solution5 soln = new Solution5();
        int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
        // int[] result = soln.shuffle(nums, 4);
        // System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(new Solution5().shuffle(nums, 4)));
    }
}
