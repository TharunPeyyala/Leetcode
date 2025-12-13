class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int count=0;
        int ans=Integer.MIN_VALUE;
        int avg=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            count+=val;
            if(i-l+1==k){
                ans=Math.max(ans,count);
                 count-=nums[l];
                 l++;
            }
        }
        return (double) ans/k;
     }
}