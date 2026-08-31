class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int low = 0; 
        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        for(int high = 0; high < s.length(); high++){

            char ch = s.charAt(high);

            while(set.contains(ch)){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(ch);

            int currLen = high - low + 1;
            maxLen = Math.max(maxLen , currLen);
        }

        return maxLen;
        

    }
}