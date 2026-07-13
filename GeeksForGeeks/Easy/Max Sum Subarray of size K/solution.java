class Solution {
    public int maxSubarraySum(int[] arr, int k) {
         int n = arr.length;

        int low = 0;
        int high = k - 1;
        int sum = 0;
        int res = Integer.MIN_VALUE;

        for (int i = low; i <= high; i++) {

            sum += arr[i];

        }

        while (high < n) {
            res = Math.max(res, sum);

            low++;
            high++;

            if (high == n)
                break;

            sum = sum - arr[low - 1];
            sum = sum + arr[high];

        }

        return res;
    }
        
    
}