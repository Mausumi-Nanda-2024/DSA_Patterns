class Solution {
    public int maxAbsoluteSum(int[] nums) {


        int maximumSum = maxSubArray(nums);
        int minimumSum = minSubArray(nums);

        return Math.max(
                Math.abs(maximumSum),
                Math.abs(minimumSum)
        );

        
    }

     public static int maxSubArray(int[] nums) {

        int n = nums.length;
        int i = 0;
        int bestending = nums[i];
        int ans = nums[i];

        for(i =1 ; i<n ; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];

            bestending = Math.max(v1, v2);
            ans = Math.max(ans, bestending);
        }

        return ans;
        
    }

    public static int minSubArray(int[] nums) {

        int n = nums.length;
        int i = 0;
        int bestending = nums[i];
        int ans = nums[i];

        for(i =1 ; i<n ; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];

            bestending = Math.min(v1, v2);
            ans = Math.min(ans, bestending);
        }

        return ans;
        
    }


}