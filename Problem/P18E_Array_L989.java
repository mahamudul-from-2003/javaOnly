package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution_18 {

    public List<Integer> addToArrayForm(int[] num, int k) {
        int size = num.length;
        int givenNumber = 0;
        
        for (int i = 0; i < size; i++) {
            givenNumber += num[i] * Math.pow(10, size - i - 1);
        }
        givenNumber += k;
        List<Integer> result = new ArrayList<>();
        int latestSize = (int) Math.log10(givenNumber) + 1;
        int temp = givenNumber;
        for (int i = latestSize - 1; i >= 0; i--) {
            result.add(i, (temp % 10));
            temp /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}

class Solution_18_AI {

    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = k;
        List<Integer> result = new ArrayList<>();
        
        for (int i = num.length - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            result.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}

public class P18E_Array_L989 {
    public static void main(String[] args) {
        int[] num = { 9,9,9,9,9,9,9,9,9,9 };
        int k = 1;
        System.out.println(new Solution_18_AI().addToArrayForm(num, k));
    }
}
