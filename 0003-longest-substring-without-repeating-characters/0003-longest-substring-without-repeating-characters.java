class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch)>1){
                char c=s.charAt(l);
                hm.put(c,hm.get(c)-1);
                l++;
            }
             ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}