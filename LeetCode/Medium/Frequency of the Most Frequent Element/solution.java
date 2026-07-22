import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;
        int low = 0;
        long sum = 0;
        int result = 0;

        for (int high = 0; high < n; high++) {

            sum += nums[high];

            while (
                (long) nums[high] * (high - low + 1) - sum > k
            ) {
                sum -= nums[low];
                low++;
            }

            int currLen = high - low + 1;

            result = Math.max(result, currLen);
        }

        return result;
    }
}