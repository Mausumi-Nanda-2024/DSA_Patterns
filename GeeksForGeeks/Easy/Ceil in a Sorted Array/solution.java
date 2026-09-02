class Solution {
    public int findCeil(int[] arr, int x) {
        
        int n = arr.length;
        int low = 0; int high = n-1; int result = -1;
        
        int guess;
        
        while(low<=high){
            
            guess = (low + high)/2;
            
            if(arr[guess] < x){
                
                low = guess + 1;
            }else{
                result = guess;
                high = guess - 1;
            }
        }
        
        return result;
        
    }
}
