package Problem;

class Solution_12 {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int[] temp = new int[gain.length + 1];
        
        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i - 1] + gain[i - 1]; 
        }
        for (int i = 0; i < temp.length; i++) {
            result = Math.max(result, temp[i]);
        }
        return result;
    }
}

public class P12E_Array_L1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(new Solution_12().largestAltitude(gain));
    }
}
