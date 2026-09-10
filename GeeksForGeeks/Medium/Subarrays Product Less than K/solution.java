class Solution {
    public int countSubarray(int[] arr, int k) {
        // code here
        if(k<=1){
            return 0;
        }
        
        long product = 1;
        int left = 0;
        int count = 0;
        
        for(int right = 0; right<arr.length; right++){
            product = product*arr[right];
            
            while(product >= k){
                product = product/arr[left];
                left++;
            }
            
            count+=right-left+1;
            
        }
        
        return count;
    }
}