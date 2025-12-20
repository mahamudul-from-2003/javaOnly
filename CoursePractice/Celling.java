package CoursePractice;

class SolnOfCelling {
    public int findCelling(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;
        int gotIt;
        if (target > nums[nums.length - 1]) {
            return -1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                gotIt = nums[mid];
                return gotIt;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public int findFloor(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;
        int gotIt;
        if (target < nums[0]) {
            return -1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                gotIt = nums[mid];
                return gotIt;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[right];
    }
}


public class Celling {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 12;
        System.out.println("Celling Value is : " + new SolnOfCelling().findCelling(nums, target) + " and Floor Value is : " + new SolnOfCelling().findFloor(nums, target));
    }
}
