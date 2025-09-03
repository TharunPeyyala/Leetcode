class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0); // base score
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int inner = stack.pop();
                int prev = stack.pop();
                stack.push(prev + Math.max(2 * inner, 1));
            }
        }
        return stack.pop();
    }
}
