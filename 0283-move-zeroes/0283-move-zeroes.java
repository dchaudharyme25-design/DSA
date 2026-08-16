class Solution {
    public void moveZeroes(int[] nums) {
        // two pointer approach we will used 
        int i=0; // pointer one 
        for (int j=0; j<nums.length; j++){ // second pointer move 
            if (nums[j]!=0){
                swap(nums,i,j);// using swap function 
                i++;
            }
        }

    }
    public void swap(int[]arr, int i, int j){
        int temp= arr [i];
       arr[i]=arr [j];
       arr[j]=temp;
    }
}