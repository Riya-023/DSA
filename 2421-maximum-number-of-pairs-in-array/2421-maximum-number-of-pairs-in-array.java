class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        int pairs = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
                pairs++;
            }
        }
        return new int[] {pairs, set.size()};
    }
}