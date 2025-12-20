package Problem;

import java.util.Arrays;

class Solution_20 {
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[101];
        for (int i = 1; i < logs.length; i++) {
            if (logs[i][0] < logs[i - 1][1]) {
                count[Math.min(logs[i][0], logs[i-1][0]) - logs[0][0]]++ ;
            }
        }
        int result = Arrays.stream(count).max().getAsInt();
        return result != 0 ? result : logs[0][0];
    }
}
public class P20E_Array_L1854 {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(new Solution_20().maximumPopulation(logs));
    }
}