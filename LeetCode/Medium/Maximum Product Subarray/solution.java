class Solution {
    public int maxProduct(int[] a) {

        int i = 0;
        int maxEnd = a[i];
        int minEnd = a[i];
        int res = a[i];

        for(i = 1; i<a.length; i++){
            int v1 = a[i];
            int v2 = minEnd*a[i];
            int v3 = maxEnd*a[i];

            maxEnd = Math.max(v1 , Math.max(v2 , v3));
            minEnd = Math.min(v1 , Math.min(v2 , v3));

            res = Math.max(res , Math.max(maxEnd , minEnd));
        }

        return res;
        
    }
}