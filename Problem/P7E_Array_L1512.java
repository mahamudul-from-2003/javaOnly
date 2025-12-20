package Problem;

class Solution7 {
    public int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pair++;
                }
            }
        }

        // AI Generated
        // Step-by-Step Walkthrough:
        // Array: [1, 2, 3, 1, 1, 3]
        // We have a counter that tracks how many times we've seen each number.
        // Person 1: Number 1 arrives
        // count[1] = 0 (no one with number 1 yet)
        // pairs += 0 → 0 pairs (no one to pair with)
        // count[1]++ → now we've seen number 1 once
        // Room state: {1: 1 person}
        // Person 2: Number 2 arrives
        // count[2] = 0 (no one with number 2 yet)
        // pairs += 0 → 0 pairs
        // count[2]++ → seen number 2 once
        // Room state: {1: 1 person, 2: 1 person}
        // Person 3: Number 3 arrives
        // count[3] = 0 (no one with number 3 yet)
        // pairs += 0 → 0 pairs
        // count[3]++ → seen number 3 once
        // Room state: {1: 1 person, 2: 1 person, 3: 1 person}
        // Person 4: Number 1 arrives again!
        // count[1] = 1 (there's already 1 person with number 1)
        // pairs += 1 → 1 pair (this new person pairs with the existing person #1)
        // count[1]++ → seen number 1 twice
        // Room state: {1: 2 people, 2: 1 person, 3: 1 person}
        // Person 5: Number 1 arrives again!
        // count[1] = 2 (there are already 2 people with number 1)
        // pairs += 2 → 3 pairs (this new person pairs with both existing #1 people)
        // count[1]++ → seen number 1 three times
        // Room state: {1: 3 people, 2: 1 person, 3: 1 person}
        // Person 6: Number 3 arrives again!
        // count[3] = 1 (there's already 1 person with number 3)
        // pairs += 1 → 4 pairs (this new person pairs with the existing #3 person)
        // count[3]++ → seen number 3 twice
        // Final: 4 pairs ✓

        // int[] count = new int[101];
        // int pairs = 0;
        // for (int num : nums) {
        // pairs += count[num];
        // count[num]++;
        // }

        return pair;
    }
}

public class P7E_Array_L1512 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(new Solution7().numIdenticalPairs(nums));
    }
}
