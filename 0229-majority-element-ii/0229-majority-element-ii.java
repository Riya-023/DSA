class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            if(! mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            }else{
                mp.put(nums[i], mp.get(nums[i])+1);
            }
        }


        List<Integer> ans = new ArrayList<>();
        for(int key : mp.keySet()){
            if( mp.get(key) > (nums.length/3)) ans.add(key);
        }
        return ans;
    }
}