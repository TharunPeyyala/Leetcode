class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];          
        Queue<Integer> queue = new LinkedList<>(); 

        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
            queue.offer(i);  
        }

        
        while (!queue.isEmpty()) {
            int idx = queue.peek();
            if (freq[s.charAt(idx) - 'a'] == 1) {
                return idx; 
            }
            queue.poll(); 
        }

        return -1;
    }
}