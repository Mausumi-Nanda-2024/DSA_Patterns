class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int n = a.length;
        int i = 0;
        int bestEnding = a[i];
        int ans = a[i];

        for(i =1 ; i<n ; i++){
            int v1 = bestEnding + a[i];
            int v2 = a[i];

            bestEnding = Math.min(v1, v2);
            ans = Math.min(ans, bestEnding);
        }

        return ans;
        
    }
}