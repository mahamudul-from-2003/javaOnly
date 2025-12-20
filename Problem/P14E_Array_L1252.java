package Problem;

class Solution_14 {
    public int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] newArray = new int[m][n];

        // for (int i = 0; i < n; i++) {            // my solution gives correct answer just
        //     newArray[indices[0][0]][i] +=1;      // for 2x2 indices matrix...😑😑😑
        // }
        // for (int i = 0; i < m; i++) {
        //     newArray[i][indices[0][1]] += 1;
        // }
        
        // for (int i = 0; i < n; i++) {
        //     newArray[indices[1][0]][i] += 1;
        // }
        // for (int i = 0; i < m; i++) {
        //     newArray[i][indices[1][1]] += 1;
        // }

        for (int k = 0; k < indices.length; k++) {
            int row = indices[k][0];
            int col = indices[k][1];

            for (int i = 0; i < n; i++) {
                newArray[row][i]++;
            }

            for (int i = 0; i < m; i++) {
                newArray[i][col]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (newArray[i][j] % 2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }
}

public class P14E_Array_L1252 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };
        System.out.println(new Solution_14().oddCells(m, n, indices));
    }
}
