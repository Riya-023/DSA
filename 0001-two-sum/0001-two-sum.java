class Solution {
    public int[] twoSum(int[] nums, int target) {
        //optimal - this is used when the array is not sorted
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int tofindinmap= target - nums[i];
            if(map.containsKey(tofindinmap)){
                return new int []{map.get(tofindinmap), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}