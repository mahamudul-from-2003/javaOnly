package Problem;

class Solution2 {
    public int[] buildArray(int[] nums) {

        int[] modifiedNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            modifiedNums[i] = nums[nums[i]];

        }
        return modifiedNums;
    }
}

public class P2E_Array_L1920 {
    public static void main(String[] args) {
        Solution2 soln = new Solution2();
        int[] nums = { 5, 0, 1, 2, 4 };
        System.out.println(soln.buildArray(nums));
    }
}
