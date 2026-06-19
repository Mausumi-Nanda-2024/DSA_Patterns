class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE; // Start with infinity for minimum problems [13, 14]

        // Hiring Phase: Move the high pointer to expand the window [15, 16]
        while (high < n) {
            sum += nums[high]; // Hire the new element [17]

            // Firing Phase: Shrink from the left as long as the condition is met [17, 18]
            while (sum >= target) {
                // Update minimum length: (End - Start + 1) [19]
                res = Math.min(res, high - low + 1);

                // Fire the element at 'low' and move the pointer [20]
                sum -= nums[low];
                low++;
            }
            
            high++; // Prepare to hire the next person from the "college" [21]
        }

        // Return 0 if no valid subarray was found [13, 22]
        return (res == Integer.MAX_VALUE) ? 0 : res;
        
    }
}