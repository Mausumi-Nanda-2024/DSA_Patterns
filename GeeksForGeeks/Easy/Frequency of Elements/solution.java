class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        Map<Integer , Integer> map = new HashMap<>();
        
        for(int num : arr){
            
            if(map.containsKey(num)){
                map.put(num , map.get(num) +1);
            }else{
                
                map.put(num , 1);
            }
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for(Map.Entry<Integer , Integer> entry:map.entrySet()){
            
            ArrayList<Integer> pair = new ArrayList<>();
            
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            
            result.add(pair);
        }
        
        return result;
    }
}