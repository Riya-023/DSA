class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){

                int left = j+1;
                int right = n-1;

                while(left < right){
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);

                        res.add(list);
                        left++;
                        right--;

                    }else if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}