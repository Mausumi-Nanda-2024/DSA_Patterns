class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        int low = 0;
        int high = k - 1;
        int sum =  0;
        double avg = 0;

        for(int i = low; i<=high; i++){
            sum+=nums[i];
            avg = (double)sum/k;
        }

        double maxAvg = avg;

        while(high< n-1){

            sum-=nums[low];
            low++;
            high++;
            sum+=nums[high];

            avg = (double)sum/k;

            maxAvg = Math.max(maxAvg , avg);

        }

        return maxAvg;
        
    }
}