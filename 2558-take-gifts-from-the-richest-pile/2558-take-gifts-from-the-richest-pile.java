class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int val=pq.poll();
            int v1=(int)Math.sqrt(val);
            pq.add(v1);
        }
        long sum=0;
        for(int i:pq){
            sum+=i;
        }
        return sum;

    }
}