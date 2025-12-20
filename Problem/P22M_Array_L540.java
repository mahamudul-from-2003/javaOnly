package Problem;

class Solution_22 {
    public int singleNonDuplicate(int[] nums) {     //i did it though the logic was not so good
        int result = 0;

        if (nums.length > 1) {
            if ((nums[1] - nums[0] != nums[2] - nums[1] && nums[1] == nums[2])) {
                result = nums[0];
            } else if (nums[nums.length - 1] - nums[nums.length - 2] != 0
                    && nums[nums.length - 3] == nums[nums.length - 2]) {
                result = nums[nums.length - 1];
            } else {
                for (int i = 1; i < nums.length - 1; i++) {
                    if (nums[i] - nums[i - 1] != 0 && nums[i] - nums[i + 1] != 0) {
                        result = nums[i];
                    }
                }
            }
        } else {
            result = nums[0];
        }

        return result;
    }
}

class Solution_22_AI {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // XOR with 1: if even, gets next odd; if odd, gets previous even
            if (nums[mid] == nums[mid ^ 1]) {
                left = mid + 1;  // Single is on the right
            } else {
                right = mid;     // Single is on the left
            }
        }
        
        return nums[left];
    }
}

class Solution_22_AI_V2 {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even (so we can check pairs)
            if (mid % 2 == 1) {
                mid--;  // Move to the left even index
            }
            
            // If nums[mid] == nums[mid+1], then single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;  // Skip the pair
            } else {
                // Single element is at mid or to the left
                right = mid;
            }
        }
        
        return nums[left];
    }
}

class Solution_22_AI_V3 {
    public int singleNonDuplicate(int[] nums) {
        // Handle edge cases
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        
        int left = 1;
        int right = nums.length - 2;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            
            // Determine which half to search
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                // Single element is on the right
                left = mid + 1;
            } else {
                // Single element is on the left
                right = mid - 1;
            }
        }
        
        return -1; // Should never reach here
    }
}
public class P22M_Array_L540 {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 7, 7, 9, 10, 10 };
        System.out.println(new Solution_22().singleNonDuplicate(nums));
    }
}
