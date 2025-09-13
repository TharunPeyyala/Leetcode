// import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) { // ✅ Base case
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // ✅ Skip duplicates
            if (candidates[i] > target) break; // ✅ Pruning
            
            current.add(candidates[i]);
            backtrack(result, current, candidates, target - candidates[i], i + 1); // ✅ i+1 (no reuse)
            current.remove(current.size() - 1);
        }
    }
}
