class Solution {
    public String removeDuplicates(String s, int k) {
        class Pair {
            char c; int count;
            Pair(char c) { this.c = c; this.count = 1; }
        }
        Deque<Pair> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().c == ch) {
                stack.peek().count++;
                if (stack.peek().count == k) stack.pop();
            } else {
                stack.push(new Pair(ch));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair p = stack.removeLast();
            for (int i = 0; i < p.count; i++) sb.append(p.c);
        }
        return sb.toString();
    }
}
