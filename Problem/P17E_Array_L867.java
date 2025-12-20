package Problem;

import java.util.Arrays;

class Solution_17 {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

public class P17E_Array_L867 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(new Solution_17().transpose(matrix)));
    }
}
// 1 2 3   1 4
// 4 5 6   2 5
//         3 6