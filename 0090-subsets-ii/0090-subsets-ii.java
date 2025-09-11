import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);                    // important: sort to handle duplicates
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> temp, List<List<Integer>> res) {
        // Every call's current combination is a valid subset — add its copy
        res.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates: when the current number is same as previous AND
            // we're at the same recursion level (i > start means this isn't the first choice here)
            if (i > start && nums[i] == nums[i - 1]) continue;

            // choose nums[i]
            temp.add(nums[i]);
            // explore further with next index (i+1) — ensures combinations, not permutations
            backtrack(nums, i + 1, temp, res);
            // undo choice
            temp.remove(temp.size() - 1);
        }
    }
}
