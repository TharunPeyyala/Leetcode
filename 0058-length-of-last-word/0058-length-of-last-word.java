class Solution {
    public int lengthOfLastWord(String s) {
       String[] ch=s.split(" ");
        String ans="";
        for(int i=0;i<ch.length;i++){
            if(i==ch.length-1){
                ans+=ch[i];
            }
        }
       return ans.length(); 
    }
}