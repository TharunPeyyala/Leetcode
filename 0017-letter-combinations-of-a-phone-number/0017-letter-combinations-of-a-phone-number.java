import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> ans = pad("", digits); // ✅ remove leading space
        return ans;
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        // ✅ Proper mapping for digits
        String[] mapping = {
            "",    // 0 → no letters
            "",    // 1 → no letters
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };

        String letters = mapping[digit];
        ArrayList<String> list = new ArrayList<>();

        // ✅ loop over actual letters instead of formula
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(pad(p + ch, up.substring(1)));
        }

        return list;
    }
}
