class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        
        int left = 0;
        int zeroCount =0;
        int maxLen = 0;
        
        for(int right = 0; right< arr.length; right++){
            
            if(arr[right] == 0){
                zeroCount++;
            }
            
            while(zeroCount > k){
                
                if(arr[left] == 0){
                    zeroCount--;
                }
                
                left++;
            }
            
            int currentLen = right - left+1;
            
            maxLen = Math.max(maxLen , currentLen);
        }
        
        return maxLen;
    }
}