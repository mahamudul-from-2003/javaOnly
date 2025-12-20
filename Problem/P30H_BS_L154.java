package Problem;

class Solution_30 {         // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (start < mid &&  nums[mid] < nums[mid - 1]) {
                // return nums[mid - 1];        // peak element
                return nums[mid];
            }
            if (end > mid && nums[mid] > nums[mid + 1]) {
                // return nums[mid];            // peak element
                return nums[mid + 1];
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    // return nums[start];
                    return nums[start + 1];
                }
                start++;

                if (nums[end] < nums[end - 1]) {
                    // return nums[end - 1];
                    return nums[end];
                }
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[0];
    }
}

public class P30H_BS_L154 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(new Solution_30().findMin(nums));
    }
}
