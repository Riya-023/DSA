// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         // brute force approach
//         // tc= O(n^3)
//         // sc = O(k) -->k is no.of unique triplet found
//         Arrays.sort(nums);
//         int n = nums.length;
//         Set<List<Integer>> ans = new HashSet<>();

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 for(int k=j+1; k<n; k++){
//                     if(nums[i]+nums[j]+nums[k] == 0){
//                         List<Integer> res = new ArrayList<>();
//                         res.add(nums[i]);
//                         res.add(nums[j]);
//                         res.add(nums[k]);
//                         ans.add(res);
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(ans);
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //optimal
        // TC- O(n log n + n^2) = O(n^2)
        // SC- O(k) -->k no. of unique triplets in the result set
        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> res = new HashSet<>();

        //fixed the first element and find other two by using 2sum 
        for(int i=0; i<n; i++){

            // two sum approach
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum ==0){
                    List<Integer> list =new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);

                    left++;
                    right--;

                }else if(sum > 0){
                    right --;
                }else{
                    left ++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}


