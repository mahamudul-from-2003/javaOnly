package Problem;

class Solution_27 {     // https://leetcode.com/problems/search-in-rotated-sorted-array/description/

    public int search(int[] nums, int target) {
        int peak = findPivot(nums);
        int size = nums.length;

        if (peak == -1) {
            return mainResult(nums, target, 0, size - 1);
        }
        
        if (target == nums[peak]) {
            return peak;
        } else if (target >= nums[0]) {
            return mainResult(nums, target, 0, peak - 1);
        } else {
            return mainResult(nums, target, peak + 1, size - 1);
        }
    }

    public int mainResult(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int findPivot(int[] arr) { // 4,5,6,7,8,1,2
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

public class P27M_BS_L33 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 1, 2 };
        int target = 7;
        System.out.println(new Solution_27().search(nums, target));
    }
}
