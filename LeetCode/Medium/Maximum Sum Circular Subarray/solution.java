class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int currentMax = nums[0];

        int maximumSum = nums[0];

        int currentMin = nums[0];

        int minimumSum = nums[0];

        int totalSum = nums[0];

        for( int i = 1 ; i<nums.length ; i++){

          int  current = nums[i];

           currentMax = Math.max(
                    currentMax + current,
                    current
            );

              maximumSum = Math.max(
                    maximumSum,
                    currentMax
            );

            currentMin = Math.min(
                    currentMin + current,
                    current
            );

             minimumSum = Math.min(
                    minimumSum,
                    currentMin
            );
            

            totalSum += current;

        }

        if (maximumSum < 0) {
            return maximumSum;
        }

        int circularSum = totalSum - minimumSum;

        return Math.max(maximumSum, circularSum);
    } 
       
    }
