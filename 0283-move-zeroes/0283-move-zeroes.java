class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0; // index where the next non-zero should be placed

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] with nums[lastNonZero]
                int temp = nums[lastNonZero];
                nums[lastNonZero] = nums[i];
                nums[i] = temp;

                lastNonZero++;
            }
        }
    }
}
