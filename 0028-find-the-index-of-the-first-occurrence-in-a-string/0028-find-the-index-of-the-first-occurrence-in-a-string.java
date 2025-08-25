class Solution {
    public int strStr(String haystack, String needle) {
      return words(haystack,needle);  
    }
    static int words(String s, String ans){
        if(s.isEmpty()){
            return -1;
        }
        for(int i=0;i<=s.length()-ans.length();i++){
            if(s.startsWith(ans,i)){
                return i;
            }
        }
        return -1;
    }
    
}