package Problem;

class Solution0 {
    public int subtractProductAndSum(int n) {
        int r = 0;
        int s = 1;
        int temp = n;
        while (temp != 0) {
            
            r = r + (temp % 10);
            s = s * (temp % 10);

            temp = temp / 10;
        }
        return s - r;
    }
}
public class P0E_Array_L1281 {
    public static void main(String[] args) {

        Solution0 soln = new Solution0();
        System.out.println(soln.subtractProductAndSum(135));

    }


}
