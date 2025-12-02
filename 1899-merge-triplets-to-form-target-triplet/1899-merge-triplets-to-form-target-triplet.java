class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] maxVals=new int[3];
        for(int[] triplet:triplets){
            if(triplet[0]<=target[0] && triplet[1]<=target[1] && triplet[2]<=target[2]){
                maxVals[0]=Math.max(maxVals[0],triplet[0]);
                maxVals[1]=Math.max(maxVals[1],triplet[1]);
                maxVals[2]=Math.max(maxVals[2],triplet[2]);
            }
        }
        return maxVals[0]==target[0] && maxVals[1]==target[1] && maxVals[2]==target[2];
    }
}