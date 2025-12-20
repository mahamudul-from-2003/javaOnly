package Problem;

class Solution_25 {         // Covers L852, L162 and almost L1095
    public int peakIndexInMountainArray(int[] arr) {
        //int result = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                //result = mid;
            } else {
                start = mid + 1;
                //result = mid + 1;
            }
        }
        return start;
    }
}

public class P25M_BS_L852 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,5,2,1 };
        System.out.println(new Solution_25().peakIndexInMountainArray(arr));
    }
}