class Solution {
    public int calculate(String s) {
        return helper(s, new int[]{0});
    }

    private int helper(String s, int[] indexRef) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        char sign = '+';
        int n = s.length();
        
        while (indexRef[0] < n) {
            char c = s.charAt(indexRef[0]);
            indexRef[0]++;

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '(') {
                num = helper(s, indexRef);
            }

            if ((!Character.isDigit(c) && c != ' ' && c != '(') || indexRef[0] == n) {
                switch (sign) {
                    case '+': stack.push(num); break;
                    case '-': stack.push(-num); break;
                    case '*': stack.push(stack.pop() * num); break;
                    case '/': stack.push(stack.pop() / num); break;
                }
                sign = c;
                num = 0;
            }

            if (c == ')') break;
        }

        int result = 0;
        while (!stack.isEmpty()) result += stack.pop();
        return result;
    }
}
