class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer , Integer> freq = new HashMap<>();
        freq.put(0 , 1);
        int n = nums.length;
        int ans = 0;
        int sum = 0;

        for(int i = 0; i<n; i++){

            sum+=nums[i];
            int rem = sum % k;

            if(rem<0){
                rem = rem + k;
            }

            ans+= freq.getOrDefault(rem , 0);

            freq.put(rem , freq.getOrDefault(rem , 0)+ 1);

        }

        return ans;
        
    }
}