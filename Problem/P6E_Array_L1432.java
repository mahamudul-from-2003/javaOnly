package Problem;

import java.util.ArrayList;
import java.util.List;

class Solution6 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}

public class P6E_Array_L1432 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        System.out.println(new Solution6().kidsWithCandies(candies, 3));
    }

}
