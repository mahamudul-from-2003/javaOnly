package Problem;

import java.util.Arrays;

class Solution_1 {
    public int[] twoSum(int[] nums, int target) { // i did it for the sorted array
        //Arrays.sort(nums);
        int size = nums.length;

        Integer[] indices = new Integer[size];
        for (int i = 0; i < size; i++) {
            indices[i] = i;
        }
        // Sort indices based on values in nums
        Arrays.sort(indices, (a, b) -> nums[a] - nums[b]);

        //int[] result = new int[2];
        int tempLeft = 0;
        int tempRight = size - 1;
        for (int i = 0; i < size; i++) {
            if (nums[indices[tempLeft]] + nums[indices[tempRight]] < target) {
                tempLeft++;
            } else if (nums[indices[tempLeft]] + nums[indices[tempRight]] > target) {
                tempRight--;
            } else {
                return new int[]{indices[tempLeft] , indices[tempRight]};
            }
        }

        return new int[0];
    }
}

public class P15E_Array_L1 {
    public static void main(String[] args) {
        int[] nums = { 1, 11, 5, 8, 6, 3 }; // 1,3,5,6,8,11
        int target = 13;
        System.out.println(Arrays.toString(new Solution_1().twoSum(nums, target)));
    }
}
