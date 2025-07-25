class Solution {
    public void moveZeroes(int[] nums) {
        //brute - using extra space
        // int n = nums.length;
        // int arr [] = new int[n]; 
        // int j =0;
        // for(int i =0; i<n ; i++){
        //     if(nums[i] !=0){
        //         arr[j] = nums[i];
        //         j++;
        //     }
        // }
        // while(j<n){
        //     arr[j] = 0;
        //     j++;
        // }
        // for(int i =0; i<n; i++){
        //     nums[i] = arr[i];
        // }

        int n = nums.length;
        int j= 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j] = 0;
            j++;
        }
    }
}