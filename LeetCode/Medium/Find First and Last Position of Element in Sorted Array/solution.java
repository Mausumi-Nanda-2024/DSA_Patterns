class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first = findFirst(nums, target);
       int last = findLast(nums , target);
       return new int[]{first, last};

    }

    public static int findFirst(int nums[] , int target){
        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        int guess;

        while(low <= high){
            guess = (low+high)/2;

            if(nums[guess] < target){
                low = guess+1;
            }else if(nums[guess] > target){
                high = guess - 1;
            }else{
                result = guess;
                high = guess-1;
            }
        }

        return result;
    }

    public static int findLast(int nums[] , int target){
        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        int guess;

        while(low <= high){
            guess = (low+high)/2;

            if(nums[guess] < target){
                low = guess+1;
            }else if(nums[guess] > target){
                high = guess - 1;
            }else{
                result = guess;
                low = guess+1;
            }
        }

        return result;
    }

}