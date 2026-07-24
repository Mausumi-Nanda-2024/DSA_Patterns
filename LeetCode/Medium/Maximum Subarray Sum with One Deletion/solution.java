class Solution {
    public int maximumSum(int[] a) {
        int noDelete = a[0];

        int oneDelete = Integer.MIN_VALUE;

        int result = a[0];

        for(int i =1 ; i< a.length; i++){
            int current = a[i];

            int previousNoDelete = noDelete;
            int previousOneDelete = oneDelete;

            noDelete = Math.max(previousNoDelete + current , current);

            if(previousOneDelete == Integer.MIN_VALUE){
                oneDelete = previousNoDelete;
            } else{
                oneDelete = Math.max(previousOneDelete + current , previousNoDelete);
            }

            result = Math.max(result , Math.max(noDelete , oneDelete));
        }

        return result;
    }
}