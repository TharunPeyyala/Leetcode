import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        // count frequency of nums1 elements
        for (int num : nums1) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // check nums2 elements
        for (int num : nums2) {
            if (hm.containsKey(num) && hm.get(num) > 0) {
                list.add(num);
                hm.put(num, hm.get(num) - 1); // decrease count
            }
        }

        // convert list to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
