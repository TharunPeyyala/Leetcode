class Solution {
    public int missingNumber(int[] nums) {
        int k=0;
        int j=0;
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     int val=nums[i];
        //     hs.add(val);
        // }
        while(j<nums.length){
            int val=nums[j];
            hs.add(val);
            j++;
        }
        for(int i=0;i<=nums.length;i++){
            if(!hs.contains(k)){
                return k;
            }
            k++;

        }
        return k;

    }
}