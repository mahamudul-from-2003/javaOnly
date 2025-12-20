package Problem;

import java.util.Arrays;
import java.util.List;

class Solution_11 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue))
                    result++;
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue))
                    result++;
            }
        } else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue))
                    result++;
            }
        }
        return result;
    }
}

public class P11E_Array_L1773 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"),
                Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(new Solution_11().countMatches(items, ruleKey, ruleValue));
    }
}
