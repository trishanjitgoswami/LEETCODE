class Solution {
    public boolean isAnagram(String s, String t) {
    int m=s.length();
    int n=t.length();
    if(m!=n) return false;
    Map<Character,Integer>h=new HashMap<>();
    for(int i=0;i<m;i++){
        char a=s.charAt(i);
         h.put(a,h.getOrDefault(a,0)+1);
    }
        for(int i=0;i<n;i++){
        char b=t.charAt(i);
         h.put(b,h.getOrDefault(b,0)-1);
    }
   
    for(int val:h.values()){
        if(val>0) return false;
    }
return true;
    }
}