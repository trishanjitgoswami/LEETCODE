class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,max=0;
        Map<Character,Integer>h=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            h.put(c,h.getOrDefault(c,0)+1);
        
while(h.get(c)>1){
    char cl=s.charAt(i);
    h.put(cl,h.get(cl)-1);
    i++;
}
max=Math.max(max,j-i+1);
    }
    return max;
}
}