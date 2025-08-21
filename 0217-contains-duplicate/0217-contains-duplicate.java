class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(hm.containsKey(val)){
                return true;
            }else{
                hm.put(val,1);
            }

        }
         return ans;
    }
}