class Solution {
    public int majorityElement(int[] nums) {
        //brute
        //tc=O(n^2)
        // Sc=O(1)
        int n = nums.length;
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i]== nums[j]) count++;
            }
            if(count > n/2) return nums[i];
            else count =0;
        }
        return -1;
    }
}