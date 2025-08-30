// 187. Repeated DNA Sequences
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        if (n < 10) return ans;

        // Map A,C,G,T -> 0,1,2,3
        int[] map = new int[26];
        map['A' - 'A'] = 0; map['C' - 'A'] = 1; map['G' - 'A'] = 2; map['T' - 'A'] = 3;

        // rolling hash with 20 bits (10 * 2)
        int hash = 0;
        int mask = (1 << 20) - 1;

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> added = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hash = ((hash << 2) | map[s.charAt(i) - 'A']) & mask;
            if (i >= 9) {
                if (!seen.add(hash) && added.add(hash)) {
                    ans.add(s.substring(i - 9, i + 1));
                }
            }
        }
        return ans;
    }
}
