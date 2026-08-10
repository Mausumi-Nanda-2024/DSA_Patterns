class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char current = s.charAt(i);

            if(!stack.isEmpty() && stack.peek() == current){
                stack.pop();
            }else{
                stack.push(current);
            }
        }

        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){

            result.append(stack.pop());
        }
        

        return result.reverse().toString();
    }
}