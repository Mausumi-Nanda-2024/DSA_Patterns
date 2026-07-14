class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int low = 0;
        int maxLen = 0;

        Map<Character , Integer> freq = new HashMap<>();

        for(int high = 0; high < s.length() ; high++){

            char highCharacter = s.charAt(high);

            freq.put(highCharacter ,freq.getOrDefault(highCharacter , 0)+1);


            while(freq.size() > k){
                char lowCharacter = s.charAt(low);

                freq.put(lowCharacter , freq.get(lowCharacter)-1);

                if(freq.get(lowCharacter) == 0){
                    freq.remove(lowCharacter);

                }

                low++;
            }

            if(freq.size() == k){
                int currentLen = high - low + 1;
                 maxLen = Math.max(maxLen , currentLen);
            }

        }
        
        if(freq.size()!= k){
            return -1;
        }else{

        return maxLen;
        }

    }
}