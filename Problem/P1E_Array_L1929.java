package Problem;

import java.util.Arrays;

class Solution1 {
    public int[] getConcatenation(int[] nums) {
        int[] modifiedNums = new int[2 * nums.length];
        for (int i = 0; i < modifiedNums.length; i++) {
            if(i > nums.length)
                modifiedNums[i] = nums[i - nums.length];
            else if(i == nums.length)
                modifiedNums[i] = nums[0];
            else 
                modifiedNums[i] = nums[i];
        }
        return modifiedNums;
    }
}

public class P1E_Array_L1929 {
    public static void main(String[] args) {
        Solution1 soln1 = new Solution1();
        int[] nums = {1, 2, 1};
        int[] result = soln1.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
