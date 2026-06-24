class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // Window ka starting index
        int left = 0;

        // Current window ka sum
        int sum = 0;

        // Minimum length store karega
        int minLen = Integer.MAX_VALUE;

        // Window ko expand karne ke liye
        for (int right = 0; right < nums.length; right++) {

            // Current element ko window me add karo
            sum += nums[right];

            // Jab tak sum target se bada ya equal hai
            while (sum >= target) {

                // Minimum window length update karo
                minLen = Math.min(minLen, right - left + 1);

                // Left element ko remove karke window shrink karo
                sum -= nums[left];

                // Left pointer ko aage badhao
                left++;
            }
        }

        // Agar koi valid subarray nahi mili
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}