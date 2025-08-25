class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            hs.add(val);
        }
        int maxStreak=0;
       for(int num:hs){
        if(!hs.contains(num-1)){
            int currNum=num;
            int currStreak=1;
            while(hs.contains(currNum+1)){
                currStreak++;
                currNum++;
            }
            maxStreak=Math.max(maxStreak,currStreak);
        }
       }
       return maxStreak;
    }
}