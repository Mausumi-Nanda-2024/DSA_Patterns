class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int low = 0; int high = n - 1;

        int guess;

        while(low <= high){

            guess = (low+high)/2;

            if(nums[guess] == target){
                return guess;
            }else if(nums[guess] < target){
                low = guess + 1;
            }else{
                high = guess - 1;
            }
        }

    return -1;
        
    }
}