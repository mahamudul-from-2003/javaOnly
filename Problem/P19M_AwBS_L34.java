package Problem;

import java.util.Arrays;

class Solution_19 {
    public int[] searchRange(int[] nums, int target) {  // quitely no help from AI . just a little, kind of syntax help
        if (nums.length == 0) {         
            return new int[] { -1, -1 }; 
        }
        int left = 0;
        int right = nums.length - 1;
        boolean found = false;
        int gotIt = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                gotIt = mid;
                found = true;
                break;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        if (!found) {
            return new int[] { -1, -1 };
        }

        int[] result = new int[] { -1, -1 };

        if (gotIt >= 0 && gotIt < nums.length) {
            int lr = gotIt;
            for (int i = gotIt; i >= 0; i--) {
                if (nums[i] == target) {
                    lr = i;
                } else {
                    break;
                }
            }

            int rr = gotIt;
            for (int i = gotIt; i < nums.length; i++) {
                if (nums[i] == target) {
                    rr = i;
                } else {
                    break;
                }
            }

            result[0] = lr;
            result[1] = rr;
        }

        return result;
    }
}

public class P19M_AwBS_L34 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 11, 11 };
        int target = 11;
        System.out.println(Arrays.toString(new Solution_19().searchRange(nums, target)));

    }
}