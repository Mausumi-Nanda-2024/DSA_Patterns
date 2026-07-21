class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int low = 0;
        int high = k - 1;
        int count = 0;
        int max = k * threshold;
        int sum = 0;

        for (int i = low; i <= high; i++) {

            sum += arr[i];
        }
        while (high < n) {

        if (sum >= max) {
            count += 1;
        }
            low++;
            high++;

            if (high == n)
                break;

            sum -= arr[low - 1];
            sum += arr[high];
        }

        return count;

    }
}