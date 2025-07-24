// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         Set<List<Integer>> res = new HashSet<>();

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){

//                 int left = j+1;
//                 int right = n-1;

//                 while(left < right){
//                     long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
//                     if(sum == target){
//                         List<Integer> list = new ArrayList<>();
//                         list.add(nums[i]);
//                         list.add(nums[j]);
//                         list.add(nums[left]);
//                         list.add(nums[right]);

//                         res.add(list);
//                         left++;
//                         right--;

//                     }else if(sum > target){
//                         right--;
//                     }else{
//                         left++;
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(res);
//     }
// }

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

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

                        while (left < right && nums[left] == nums[left - 1]) left++;

                    }else if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return res;
    }
}