class Solution {
    public int removeDuplicates(int[] nums) {
        // TC- O(n)
        // Sc- O(n)
        // int n = nums.length;
        // Set<Integer> list = new HashSet<>();
        // int index=0;

        // for(int i=0; i<n; i++){
        //     if(! list.contains(nums[i])){
        //         list.add(nums[i]);
        //         nums[index] = nums[i];
        //         index++;
        //     }
        // }
        // return index;


        //tc- O(n)
        //sc- O(1)
        if (nums.length == 0) return 0;
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j; 
    }
}