class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        // making a hashset 
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Current element add
            sum += nums[right];

            // Frequency increase
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Window size k se badi ho gayi
            if (right - left + 1 > k) {

                sum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                // Frequency 0 ho gayi to remove
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Window size exactly k
            if (right - left + 1 == k) {

                // Agar saare elements unique hain
                if (map.size() == k) {

                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }
}