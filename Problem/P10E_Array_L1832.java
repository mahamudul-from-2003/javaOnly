package Problem;

class Solution_10 {
    public boolean checkIfPangram(String sentence) {
        char[] sentenceArray = sentence.toCharArray();
        int[] count = new int[26];
        int words = 0;
        for (int i = 0; i < sentenceArray.length; i++) {
            if (count[sentenceArray[i] - 'a'] == 0 ) {
                words++;
                count[sentenceArray[i] - 'a']++;
            }
        }
        return (words == 26)?true:false;
    }
}

public class P10E_Array_L1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydoghfakjjljfdalkjljald";
        System.out.println(new Solution_10().checkIfPangram(sentence));
    }
}
