class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int[] arr=new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
            int v1=pq.poll();
            int v2=pq.poll();
            arr[j]=v2;
            j++;
            arr[j]=v1;
            j++;
        } 
        return arr;
        
           }

}