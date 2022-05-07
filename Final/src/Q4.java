public class Q4 {
    /**
     * Question 4: Given an integer n, return any array containing n unique integers such that they add up to 0.
     *
     * Input: n = 5
     * Output: [-7,-1,1,3,4]
     * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
     * Input: n = 3
     * Output: [-1,0,1]
     * @param n
     * @return
     */



    public int[] sumZero(int n) {
        //TODO: Write your code here
        int[] res = new int[n];
        int min = -n / 2;
        for (int i = 0; i < n; i++) {
            res[i] = min++;

            if (n % 2 == 0 && res[i] == 0)
                res[i] = min++;
        }
        return res;
    }
}
