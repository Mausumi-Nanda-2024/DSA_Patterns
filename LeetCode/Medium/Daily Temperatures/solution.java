import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] temp) {

        int n = temp.length;

        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Last day has no future day.
        stack.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {

            while (!stack.isEmpty()
                    && temp[stack.peek()] <= temp[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {

                ans[i] = 0;

            } else {

                ans[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return ans;
    }
}