package Problem;

// 7, 2, 5, 8, 10      and k = 2
// new array is [ 10, 32 ] where start = 10, end = 32 and mid = 21
// here the subarrays are [ 7, 2, 5] and [ 10, 8] where pieces <= k ; so, end = mid; means, end = 21
// now, the mid = (10 + 21) / 2 = 15 and possible subarrays are [ 7, 2, 5] , [ 10] and [ 8 ] where pieces > k ; so, start = mid + 1; means, start = 16
// now, the mid = (16 + 21) / 2 = 18 and possible subarrays are [ 7, 2, 5] , [ 10 , 8 ] where pieces <= k ; so, end = mid; means, end = 18
// now, the mid = (16 + 18) / 2 = 17 and possible subarrays are [ 7, 2, 5] , [ 10] and [ 8 ] where pieces > k ; so, start = mid + 1; means, start = 18
// now, the mid = (18 + 18) / 2 = 18 and this is the answer because start == end

class Solution_31 { // https://leetcode.com/problems/split-array-largest-sum/description/
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // i can not add this num to the subarray, need to make another new one
                    // if i add the num in the new subarray, then the sum will be the num. means sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end; // end or start is the same(end == start)
    }
}

public class P31H_BS_L410 {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
        System.out.println(new Solution_31().splitArray(nums, k));
    }
}