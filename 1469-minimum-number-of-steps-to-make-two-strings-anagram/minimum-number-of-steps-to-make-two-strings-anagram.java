class Solution {
    public int minSteps(String s, String t) {
        int m=s.length();
        int n=t.length();
        Map<Character,Integer>h=new HashMap<>();
        for(int i=0;i<m;i++){
          char a=s.charAt(i);
            h.put(a,h.getOrDefault(a,0)+1);
        }
                for(int i=0;i<n;i++){
           char b=t.charAt(i);
            h.put(b,h.getOrDefault(b,0)-1);
        }
        int ans=0;
        for(int i:h.values()){
            if(i>0){
                ans+=i;
            }
        }
        return ans;
    }
}