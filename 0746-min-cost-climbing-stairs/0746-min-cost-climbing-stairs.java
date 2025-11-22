class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) {
            return cost[0];
        }
        if(cost.length==2){
            return Math.min(cost[0],cost[1]);
        }
        int n1=cost[0];
        int n2=cost[1];
        for(int i=2;i<cost.length;i++){
            int current=Math.min(n1,n2)+cost[i];
            n1=n2;
            n2=current;
        }
        return Math.min(n1,n2);
    }
}