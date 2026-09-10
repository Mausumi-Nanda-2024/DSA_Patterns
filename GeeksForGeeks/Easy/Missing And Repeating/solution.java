class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int num: arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        
        int duplicate = -1;
        int missing = -1;
        
        for(int i = 1; i<=arr.length; i++){
            if(map.getOrDefault(i,0)==2){
                duplicate = i;
            }
            
            if(map.getOrDefault(i , 0)==0){
                missing = i;
            }
        }
        
      ArrayList<Integer> result = new ArrayList<>();

             result.add(duplicate);
             result.add(missing);

             return result;
        
    }
}
