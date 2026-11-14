class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>smap=new HashMap<>();
         Map<Character,Integer>tmap=new HashMap<>();
         for(int i=0;i<t.length();i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
         }
    int min=Integer.MAX_VALUE,left=0;
    String str="";
    int count=t.length();
    for(int right=0;right<s.length();right++){
        char c=s.charAt(right);
        smap.put(c,smap.getOrDefault(c,0)+1);
    if(tmap.containsKey(c)&& smap.get(c)<=tmap.get(c)){
        count--;
    }
 while(count==0){
    if(right-left+1<min){
        min=right-left+1;
        str=s.substring(left,right+1);
    }
    char cl=s.charAt(left);
    smap.put(cl,smap.get(cl)-1);
    if(tmap.containsKey(cl)&& smap.get(cl)<tmap.get(cl)){
        count++;
    }
    left++;
 }
    }
    return str;
    }
}