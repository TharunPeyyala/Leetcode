class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> hm=new HashMap<>();
		char[] arr= {'I','V','X','L','C','D','M'};
		int[] arr1= {1,5,10,50,100,500,1000};
		for(int i=0;i<arr.length;i++) {
			char temp=arr[i];
			int a=arr1[i];
			hm.put(temp, a);
			
			
		}
		int ans=hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
                ans-=hm.get(s.charAt(i));
            }else{
                ans+=hm.get(s.charAt(i));
            }
        }
      
		return ans;
    }
}