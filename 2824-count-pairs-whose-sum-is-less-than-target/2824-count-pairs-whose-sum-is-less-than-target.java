class Solution {
    public int countPairs(List<Integer> nums, int target) {

        // List ko ascending order me sort kar diya.
        // Two Pointer Approach sirf sorted array/list par hi kaam karti hai.
        Collections.sort(nums);
        int left = 0;

        int right = nums.size() - 1;

        // Valid pairs count 
        int count = 0;

        // Jab tak dono pointers cross nahi hote
        while (left < right) {

            // Current pair ka sum
            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {

                /*
                 Kyuki list sorted hai,
                 to left ke saath right se pehle wale
                 saare elements bhi valid honge.

                 Example:
                 left = -1
                 right = 2

                 -1+2 ✔
                 -1+1 ✔
                 -1+1 ✔

                 Isliye ek-ek pair check nahi karte.
                 Seedha count += (right-left)
                */
                count += (right - left);

                // Ab next left element check karenge
                left++;

            } else {

                /*
                 Sum bada ya equal hai.

                 Right wali value badi hai.
                 Isliye right ko ek step left le aao.
                */
                right--;
            }
        }

        return count;
    }
}