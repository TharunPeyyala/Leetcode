class Solution {
    public int compress(char[] chars) {
        int index = 0;   // write position
        int i = 0;       // read pointer

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of currentChar
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write char
            chars[index++] = currentChar;

            // Write count if > 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // new length
    }
}
