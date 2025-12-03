class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //brute TC+ O(n^2), SC=O(1)
        // List<Integer> ans = new ArrayList<>();
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     int count =0;
        //     for(int j=0; j<n; j++){
        //         if(nums[i] == nums[j]) count ++;
        //     }
        //     if(count > (n/3) && !ans.contains(nums[i])) ans.add(nums[i]);
        // }
        // return ans;

        //better TC=O(n) SC=O(n)
        // HashMap<Integer, Integer> mp = new HashMap<>();

        // for(int i =0; i< nums.length; i++){
        //     if(! mp.containsKey(nums[i])){
        //         mp.put(nums[i], 1);
        //     }else{
        //         mp.put(nums[i], mp.get(nums[i])+1);
        //     }
        // }


        // List<Integer> ans = new ArrayList<>();
        // for(int key : mp.keySet()){
        //     if( mp.get(key) > (nums.length/3)) ans.add(key);
        // }
        // return ans;

        //optimal using moore voting algorithm
        // TC= O(n) SC=O(1)
        
        int n = nums.length;
        int majority1 =0;
        int count1=0;
        int majority2=0;
        int count2=0;

        List<Integer> ans = new ArrayList<>();

        for(int i =0; i<n; i++){
            if(count1==0 && nums[i] != majority2){
                majority1= nums[i];
                count1++;
            }
            else if(count2 == 0 && nums[i] != majority1){
                majority2 = nums[i];
                count2++;
            }
            else if(nums[i] == majority1) count1++;
            else if(nums[i] == majority2) count2++;
            else{
                count1--;
                count2--;
            }
        }

        //manual check or verification
        count1 =0;
        count2=0;
        for(int num : nums){
            if(num == majority1) count1++;
            if(num == majority2) count2++;
        }

        if(count1 > (n/3)) ans.add(majority1);
        if(count2 > (n/3)){
            if(! ans.contains(majority2)) ans.add(majority2);
        }
        
        return ans;
    }
}