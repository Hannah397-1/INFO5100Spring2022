public class Test {
    public static void main(String[] args) {
        // Q1 Test
        /**
         * Input: s = "()[]{}"
         * Output: true
         * Input: s = "(]"
         * Output: false
         */
        Q1 q1 = new Q1();
        String str1_1 = "()[]{}";
        boolean q1Test1 = q1.isValid(str1_1);
        System.out.println("Q1 Test1 : " + q1Test1);

        String str1_2 = "(]";
        boolean q1Test2 = q1.isValid(str1_2);
        System.out.println("Q1 Test2: " + q1Test2);





        // Q2 Test
        /**
         * Input: "aabcccccaaa"
         * Output: "a2b1c5a3"
         * Input: "ab"
         * Output: "ab"
         */
        Q2 q2 = new Q2();
        String str2_1 = "aabcccccaaa";
        String q2Test1 = q2.compressString(str2_1);
        System.out.println("Q2 Test1 : " + q2Test1);

        String str2_2 = "ab";
        String q2Test2 = q2.compressString(str2_2);
        System.out.println("Q2 Test2: " + q2Test2);





        // Q3 Test
        /**
         * Input: s = "bbbbb"
         * Output: 1
         * Explanation: The answer is "b", with the length of 1.
         * Input: s = "pwwkew"
         * Output: 3
         * Explanation: The answer is "wke", with the length of 3.
         * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
         */
        Q3 q3 = new Q3();
        String str3_1 = "bbbbb";
        int res1 = q3.lengthOfLongestSubstring(str3_1);
        System.out.println("Q3 Test1: " + res1);

        String str3_2 = "pwwkew";
        int res2 = q3.lengthOfLongestSubstring(str3_2);
        System.out.println("Q3 Test2: " + res2);

        String str3_3 = "";
        int res3 = q3.lengthOfLongestSubstring(str3_3);
        System.out.println("Q3 Test3: " + res3);




        // Q4 Test
        /**
         * Input: n = 5
         * Output: [-7,-1,1,3,4]
         * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
         * Input: n = 3
         * Output: [-1,0,1]
         */
        Q4 q4 = new Q4();
        int n1 = 5;
        int[] ans1 = q4.sumZero(n1);

        int n2 = 3;
        int[] ans2 = q4.sumZero(n2);

        // debug




        // Q5 Test
        /**
         *Input: nums = [3,2,1,5,6,4], k = 2
         * Output: 5
         *
         * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
         * Output: 4
         */
        Q5 q5 = new Q5();

        int[] nums1 = new int[]{3,2,1,5,6,4};
        int k1 = 2;
        int a1 = q5.findKthLargest(nums1,k1);
        System.out.println("Q5 Test1: " + a1);

        int[] nums2 = new int[]{3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        int a2 = q5.findKthLargest(nums2,k2);
        System.out.println("Q5 Test2: " + a2);

        int[] nums3 = new int[]{};
        int k3 = 5;
        int a3 = q5.findKthLargest(nums3,k3);
        System.out.println("Q5 Test3: " + a3);

    }
}
