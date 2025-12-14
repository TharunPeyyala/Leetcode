class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int count=0;
        int[] ans=new int[2];
        for(int i=0;i<numbers.length;i++){
            count=numbers[start]+numbers[end];
            if(count==target){
                ans[0]=start+1;
                ans[1]=end+1;
                break;
            }
            if(count>target){
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
}