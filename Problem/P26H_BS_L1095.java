package Problem;

class Solution_26 {
    public int findInMountainArray(int[] mountainArr, int target) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int newStart = 0;
        int newEnd = start;
        int newResult = 0;
        while (newStart <= newEnd) {
            int newMid = newStart + (newEnd - newStart) / 2;
            if (target == mountainArr[newMid]) {
                newResult = newMid;
                return newResult;
            } else if (target > mountainArr[newMid]) {
                newStart = newMid + 1;
            } else {
                newEnd = newMid - 1;
            }
        }
        return newResult;
    }
}

// class Solution_26_L {
//     public int findInMountainArray(MountainArray mountainArr, int target) {
//         int start = 0;
//         int end = mountainArr.length() - 1;
//         while (start < end) {
//             int mid = start + (end - start) / 2;
//             if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
//                 end = mid;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         int newStart = 0;
//         int newEnd = start;
//         int newResult = -1;
//         while (newStart <= newEnd) {
//             int newMid = newStart + (newEnd - newStart) / 2;
//             if (target == mountainArr.get(newMid)) {
//                 newResult = newMid;
//                 return newResult;
//             } else if (target > mountainArr.get(newMid)) {
//                 newStart = newMid + 1;
//             } else {
//                 newEnd = newMid - 1;
//             }
//         }
//         if (newResult == -1) {
//             newStart = start + 1;
//             newEnd = mountainArr.length() - 1;
//             while (newStart <= newEnd) {
//                 int newMid = newStart + (newEnd - newStart) / 2;
//                 if (target == mountainArr.get(newMid)) {
//                     newResult = newMid;
//                     return newMid;
//                 } else if (target < mountainArr.get(newMid)) {
//                     newStart = newMid + 1;
//                 } else {
//                     newEnd = newMid - 1;
//                 }
//             }
//         }
//         return newResult;
//     }
// }

public class P26H_BS_L1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2 };
        int target = 2;
        System.out.println(new Solution_26().findInMountainArray(arr, target));
    }
}
