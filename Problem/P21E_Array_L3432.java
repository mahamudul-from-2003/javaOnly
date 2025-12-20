package Problem;

import java.util.Arrays;

class Solution_21 {
    public int countPartitions(int[] nums) {
        int result = 0;
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            int preSum = Arrays.stream(nums,0,i+1).sum();
            int postSum = Arrays.stream(nums,i+1,size).sum();
            if ((Math.abs(preSum - postSum)) % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}

//AI Generated
class Solution_21_AI {
    public int countPartitions(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if ((leftSum & 1) == ((totalSum - leftSum) & 1)) {
                count++;
            }
        }
        
        return count;
    }
}

public class P21E_Array_L3432 {
    public static void main(String[] args) {
        int[] nums = {10,10,3,7,6};
        System.out.println(new Solution_21().countPartitions(nums));
    }
}