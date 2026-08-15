class Solution {

    private static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        // Stack to store our custom character-count pairs [1]
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Case 1: Stack is empty - push character with count 1 [2]
            if (st.isEmpty()) {
                st.push(new Pair(c, 1));
            } 
            // Case 2: Character mismatch with top - push new pair with count 1 [2]
            else if (st.peek().ch != c) {
                st.push(new Pair(c, 1));
            } 
            // Case 3: Character matches and count is less than K - 1 - increment count [3, 4]
            else if (st.peek().count < k - 1) {
                Pair top = st.pop();
                st.push(new Pair(top.ch, top.count + 1)); // Safely update count [4]
            } 
            // Case 4: Character matches and completes K duplicates - Bombard! (Pop) [4]
            else {
                st.pop(); 
            }
        }

        // Rebuilding the final string from the remaining pairs in the stack [5]
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            Pair top = st.pop();
            int count = top.count;
            // Append the character count times [5]
            while (count > 0) {
                sb.append(top.ch);
                count--;
            }
        }

        // Reverse the string because the stack pops elements in LIFO order [5, 6]
        return sb.reverse().toString();
    }
}
