class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>f=new HashMap<>();
         Map<Character,Integer>s=new HashMap<>();
         if(s1.length()>s2.length()) return false;
         for(int i=0;i<s1.length();i++){
            f.put(s1.charAt(i),f.getOrDefault(s1.charAt(i),0)+1);
         }
         int left=0;
         for(int right=0;right<s2.length();right++){
        s.put(s2.charAt(right),s.getOrDefault(s2.charAt(right),0)+1);
     while(right-left+1>s1.length()){
        s.put(s2.charAt(left),s.get(s2.charAt(left))-1);
        if(s.get(s2.charAt(left))==0){
            s.remove(s2.charAt(left));
        }
        left++;
     }
     if(s.equals(f)){
        return true;
     }
         }
return false;
    }
}