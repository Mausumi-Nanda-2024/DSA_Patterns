class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        int n = s.length();
        int k = 10;
        int low =0;
        int high = k-1;

        HashMap<String , Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        while(high < n){

        String window = s.substring(low , high+1);

        map.put(window ,map.getOrDefault(window , 0) +1 );

        if(map.get(window) == 2){
            result.add(window);
        }

        low++;
        high++;

        }

        return result;
        
    }
}