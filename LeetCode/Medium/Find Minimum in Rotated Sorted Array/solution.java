class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int result = -1;

        int mid = 0;

        int low = 0;

        int high = n-1;

        while(low<=high){

            mid = low + (high - low)/2;

            if(nums[mid] > nums[n-1]){
                low = mid + 1;
            }else{
                result = nums[mid];
                high = mid - 1;
            }
        }

        return result;
        
    }
}