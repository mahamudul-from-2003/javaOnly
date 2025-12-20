package Problem;

import java.util.Arrays;

class Solution_13 {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                result[i][j] = (image[i][image.length - 1 - j] == 1) ? 0 : 1;       //Partially helped by AI
            }
        }
        return result;
    }
}

public class P13E_Array_L832 {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(Arrays.deepToString(new Solution_13().flipAndInvertImage(image)));
    }
}