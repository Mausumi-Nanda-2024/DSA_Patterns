class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;

        int low = 0;
        int maxLen = 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {

            int currentFruit = arr[high];

            freq.put(currentFruit, freq.getOrDefault(currentFruit, 0) + 1);

            while (freq.size() > 2) {

                int leftFruit = arr[low];

                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                low++;
            }

            int currentLen = high - low + 1;
            maxLen = Math.max(maxLen, currentLen);
        }

        return maxLen;
    }
}