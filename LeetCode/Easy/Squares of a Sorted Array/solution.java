class Solution {
    public int[] sortedSquares(int[] arr) {

         int n= arr.length;
        int i =0 ;
        int j = n-1;
        int[] ans = new int[n];
        int index = ans.length -1;
        while(i <= j){
        
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[index] = arr[i] * arr[i];
                i++;
            }else{
                ans[index] = arr[j]* arr[j];
                j--;
            }
            index--;
        
        }

        return ans;
        
    }
}