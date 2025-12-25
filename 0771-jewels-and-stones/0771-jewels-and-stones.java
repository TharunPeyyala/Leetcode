class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      HashMap<Character,Integer> hm=new HashMap<>();
      for(int i=0;i<jewels.length();i++){
        char ch=jewels.charAt(i);
        if(hm.containsKey(ch)){
            int prev=hm.get(ch);
            hm.put(ch,prev+1);
        }else{
            hm.put(ch,1);
        }
      }  
      int count=0;
      for(int i=0;i<stones.length();i++){
        char ch=stones.charAt(i);
        if(hm.containsKey(ch)){
            count++;
        }

      }
      return count;
    }
}