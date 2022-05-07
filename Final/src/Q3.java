import java.util.HashMap;

public class Q3 {
    /**
     * Question 3: Given a string s, find the length of the longest substring without repeating characters.
     *
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public int lengthOfLongestSubstring(String s) {
        //TODO: Write your code here
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
