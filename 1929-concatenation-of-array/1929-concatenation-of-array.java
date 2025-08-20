class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
		int[] arr=new int[n];
		for(int i=0;i<nums.length;i++) {
			arr[i]=nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			arr[nums.length+i]=nums[i];
		}
        return arr;
    }
}