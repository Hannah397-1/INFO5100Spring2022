import java.util.PriorityQueue;

public class Q5 {
    /**
     * Question 5: Given an integer array nums and an integer k, return the kth largest element in the array.
     *
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
     *
     * Input: nums = [3,2,1,5,6,4], k = 2
     * Output: 5
     *
     * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
     * Output: 4
     */
    public int findKthLargest(int[] nums, int k) {
        //TODO: Write your code here
        int n = nums.length;
        if(k > n) return -1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
            while (queue.size() > k) {
                queue.poll();
            }
        }
        int res = queue.poll();
        return res;
    }
}
