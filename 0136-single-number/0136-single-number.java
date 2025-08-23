class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
           int temp=nums[i];
           if(hs.contains(temp)){
             hs.remove(temp);
           }else{
               hs.add(temp);
           }
       }
       return hs.iterator().next();
    }
}