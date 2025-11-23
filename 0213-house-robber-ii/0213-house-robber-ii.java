class Solution {
    public int rob(int[] nums) {
if (nums.length == 1) {
return nums[0];
}

// If two houses, return max
if (nums.length == 2) {
return Math.max(nums[0], nums[1]);
}


        int[] lastSkip=new int[nums.length-1];
        int[] firstSkip=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            lastSkip[i]=nums[i];
            firstSkip[i]=nums[i+1];
        }
        int lootSkippingLast=Robber(lastSkip);
        int lootSkippingfirst=Robber(firstSkip);
        return Math.max(lootSkippingLast,lootSkippingfirst);
    }
    private int Robber(int[] nums){
         int[] dp=new int[nums.length];
          dp[0]=nums[0];
          dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
           dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
             }

return dp[nums.length-1];                             
   }
}