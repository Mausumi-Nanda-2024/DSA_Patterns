import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {

        // Stores:
        // prefix sum -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has appeared once
        map.put(0, 1);

        // Running prefix sum
        int sum = 0;

        // Total number of valid subarrays
        int count = 0;

        for (int num : nums) {

            // Add current number to prefix sum
            sum += num;

            // We need to find this previous prefix sum
            int required = sum - k;

            // If it exists, add its frequency
            if (map.containsKey(required)) {
                count += map.get(required);
            }

            // Store/update current prefix sum
            map.put(
                sum,
                map.getOrDefault(sum, 0) + 1
            );
        }

        return count;
    }
}