class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer , Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0 , 1);

        for(int num: nums){

            sum+=num;

            int remainder = sum%k;

           if (remainder < 0) {
                remainder += k;
            }

            // If this remainder appeared before,
            // every previous occurrence creates
            // one valid subarray.
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            // Store/update frequency of this remainder
            map.put(
                remainder,
                map.getOrDefault(remainder, 0) + 1
            );
        }

        return count;
        }
        
    }
