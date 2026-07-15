class Solution {
    public int characterReplacement(String s, int k) {

        int low = 0;
        int res = 0;
        int maxCount = 0;
        int[] freq = new int[256];

        for(int high = 0; high<s.length(); high++){

            char currentHigh = s.charAt(high);
            freq[currentHigh]++;

            int len = high - low + 1;
            maxCount = Math.max(maxCount , freq[currentHigh]);
            int diff = len - maxCount;

            while(diff > k){

                char currentLow = s.charAt(low);
                freq[currentLow]--;
                low++;

                len = high - low + 1;
                maxCount = Math.max(maxCount , freq[currentLow]);
                diff = len - maxCount;

            }
              len = high - low + 1;
              res = Math.max(res , len);
        }

            return res;

        
    }
}