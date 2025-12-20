package CoursePractice;

class SolutionOfRotationCount {         //https://www.geeksforgeeks.org/problems/rotation4723/1
    public int findKRotation(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                // return mid;
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                // return mid - 1;
                return mid;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 2, 3, 6, 12 };
        System.out.println(new SolutionOfRotationCount().findKRotation(arr));
    }
}
