package Problem;

class Solution_28 {         //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
    public boolean search(int[] nums, int target) {
        int peak = findPivot(nums);
        int size = nums.length;

        if (peak == -1) {
            return mainResult(nums, target, 0, size - 1);
        }
        
        if (target == nums[peak]) {
            return true;
        } else if (target >= nums[0]) {
            return mainResult(nums, target, 0, peak - 1);
        } else {
            return mainResult(nums, target, peak + 1, size - 1);
        } 
        
    }

    public boolean mainResult(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return true;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public int findPivot(int[] arr) {       // 2,5,6,0,0,1,2
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

            // if elements ar middle, start and end are equal then just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot
                // check if the start is the pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check it the end is the pivot
                if (arr[end] < arr[end - 1] ) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

public class P28M_BS_L81 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        System.out.println(new Solution_28().search(nums, target));
    }
}
