package Problem;

class Solution_24 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        if (target >= letters[right]) {
            return letters[0];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target >= letters[mid]) {
                left = mid + 1;
            } else if( target <= letters[mid] ) {
                right = mid - 1;
            }
        }

        return letters[left];
    }
}

public class P24E_BS_L744 {
    public static void main(String[] args) {
        char[] letters = { 'c',  'f', 'j' };
        char target = 'c';
        System.out.println(new Solution_24().nextGreatestLetter(letters, target));
    }
}
