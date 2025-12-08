class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;
        int count=0;
        int l=0;
        int n=s.length();
        for(int i=0;i<n-k+1;i++){
            boolean ans=fun(s.substring(i,i+k),k);
            if(ans){
                count+=1;
            }
            
        }
        return count;
    }
        static boolean fun(String s,int k){
            HashSet<Character> hs=new HashSet<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                hs.add(ch);
            }
            if(hs.size()==k){
                return true;
            }else{
                return false;
            }
        }
    
}