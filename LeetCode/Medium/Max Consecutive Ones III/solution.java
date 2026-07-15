class Solution {
    public int longestOnes(int[] arr, int k) {

        
        int low = 0;
        int res = 0;
        int zeroCount = 0;

        for(int high = 0; high<arr.length; high++){
            
            if(arr[high] == 0){
                zeroCount++;
            }

            while(zeroCount > k){

                if(arr[low] == 0){
                    zeroCount--;
                }

                low++;

            }
             int len = high - low + 1;
             res = Math.max(res , len);
        }

            return res;

    }
        
}
