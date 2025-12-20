package Problem;

class Solution4 {
    public int maximumWealth(int[][] accounts) {

        int wealth = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }

            if (wealth > max) {     //max = Math.max(max, wealth);
                max = wealth;
            }

            wealth = 0;
        }
        return max;
    }
}

public class P4E_Array_L1672 {
    public static void main(String[] args) {
        Solution4 soln = new Solution4();
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(soln.maximumWealth(accounts));
    }
}
