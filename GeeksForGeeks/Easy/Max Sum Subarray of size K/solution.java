class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int n = arr.length;

        int low = 0;
        int high = k - 1;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Calculate the first window
        for (int i = low; i <= high; i++) {
            sum += arr[i];
        }

        maxSum = sum;

        // Slide the window
        while (high < n - 1) {

            // Remove the element leaving the window
            sum -= arr[low];

            // Move the window
            low++;
            high++;

            // Add the new element entering the window
            sum += arr[high];

            // Update maximum
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}