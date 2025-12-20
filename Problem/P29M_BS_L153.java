package Problem;

class Solution_29 {     // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (start < mid &&  nums[mid] < nums[mid - 1]) {
                // return nums[mid - 1];        // peak element
                return nums[mid];
            }
            if (end > mid && nums[mid] > nums[mid + 1]) {
                // return nums[mid];            // peak element
                return nums[mid + 1];
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return nums[0];                         // if not found that means it is in the first place
    }
}

public class P29M_BS_L153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(new Solution_29().findMin(nums));
    }
}
