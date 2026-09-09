class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashMap<Integer , Boolean> Seen = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int val: arr){
            
            if(!Seen.containsKey(val)){
                result.add(val);
                Seen.put(val , true);
            }
        }
        
        return result;
    }
}