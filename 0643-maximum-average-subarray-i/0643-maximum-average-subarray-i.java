class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // Pehli window ka sum nikalenge
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Maximum sum ko first window ke sum se initialize kiya
        int maxSum = sum;

        // Window ko slide karenge
        for (int i = k; i < nums.length; i++) {

            // Naya element add karo
            sum += nums[i];

            // Purana element remove karo
            sum -= nums[i - k];

            // Maximum sum update karo
            maxSum = Math.max(maxSum, sum);
        }

        // Maximum average return karo
        return (double) maxSum / k;
    }
}