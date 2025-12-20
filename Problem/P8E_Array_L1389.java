package Problem;

import java.util.Arrays;

class Solution_8 {      //https://leetcode.com/problems/create-target-array-in-the-given-order/description/
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[index[i]] = nums[i];
        }
        return result;
    }
}

public class P8E_Array_L1389 { //1389. Create Target Array in the Given Order
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] result = new Solution_8().createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
}
