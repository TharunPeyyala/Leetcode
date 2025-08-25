class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hm=new HashSet<>();
        while(n!=1){
            if(hm.contains(n)){
                return false;
            }
            hm.add(n);
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}