class Solution {
    public int maximumSum(int[] arr) {

        int n = arr.length;

        int no_power = arr[0];
        int power = 0;
        int result = arr[0];

        for(int i = 1; i<n; i++){

            int v1 = arr[i];
            int v2 = no_power + arr[i];
            int v3 = power + arr[i];
            int v4 = no_power;

           result = Math.max(result,
                    Math.max(Math.max(v1, v2), Math.max(v3, v4)));

           int  no_power_new = Math.max(v1 , v2);
            int power_new = Math.max(v3 , v4);

            no_power = no_power_new;
            power = power_new;
        }
        
        return result;
    }
}