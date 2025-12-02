class Solution {
    public int maxSubArray(int[] nums) {
        //  int maxSum = nums[0];
        // int windowSum = 0;

        // for (int num : nums) {
        //     // Expand window
        //     windowSum += num;

        //     // Update max
        //     if (windowSum > maxSum) {
        //         maxSum = windowSum;
        //     }

        //     // Shrink window if sum is negative
        //     if (windowSum < 0) {
        //         windowSum = 0;
        //     }
        // }

        // return maxSum;
        int maxSum=nums[0];
        int current=0;
        for(int num:nums){
            current+=num;
            if(current>maxSum){
                maxSum=current;
            }
            if(current<0){
                current=0;
            }
        }
        return maxSum;
    }
}