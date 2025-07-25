class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> list = new HashSet<>();
        int index=0;

        for(int i=0; i<n; i++){
            if(! list.contains(nums[i])){
                list.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}