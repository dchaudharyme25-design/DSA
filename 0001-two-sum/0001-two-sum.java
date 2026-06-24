class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap stores: <number, index>
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Find the number required to make the target
            int complement = target - nums[i];

            // If complement already exists, answer mil gaya
            if (map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }

            // Store current element and its index
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}