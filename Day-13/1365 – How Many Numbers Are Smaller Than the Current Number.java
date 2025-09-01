import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone(); // make a copy
        Arrays.sort(sorted); // sort it
        
        // HashMap to store first occurrence index (count of smaller elements)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.putIfAbsent(sorted[i], i);
        }
        
        // Build result using map
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = hm.get(nums[i]);
        }
        
        return result;
    }
}
