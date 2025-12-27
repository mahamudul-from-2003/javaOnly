package CoursePractice;

import java.util.Arrays;

class Solution_ClosestTo0 { // https://www.geeksforgeeks.org/problems/two-numbers-with-sum-closest-to-zero1737/1
    public int closestToZero(int arr[], int n) {
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int result = arr[start] + arr[end];
        while (start < end) {
            int temp = arr[start] + arr[end];
            if (Math.abs(temp) < Math.abs(result)) {
                result = temp;
            } else if (Math.abs(temp) == Math.abs(result)) {
                if (temp > result) {
                    result = temp;
                }
            }
            if (arr[start] + arr[end] == 0) {
                return 0;
            } else if (Math.abs(arr[start]) < Math.abs(arr[end])) {
                end--;
            } else {
                start++;
            }
        }
        return result;
    }
}

public class ClosestTwoSumTo0 {
    public static void main(String[] args) {
        int n = 11;
        int[] arr = { -100, -67, -65, -37, -20, -18, 4, 17, 21, 52, 300 };
        System.out.println(new Solution_ClosestTo0().closestToZero(arr, n));
    }
}
