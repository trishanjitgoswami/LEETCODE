class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>res=new ArrayList<>();
        if(s.length()<p.length()) return res;
        Map<Character,Integer>smap=new HashMap<>();
        Map<Character,Integer>pmap=new HashMap<>();
        int l=0,count=p.length();
        for(char c:p.toCharArray()){
            pmap.put(c,pmap.getOrDefault(c,0)+1);
        }
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(pmap.containsKey(ch)&& smap.get(ch)<=pmap.get(ch)){
                count--;
            }
            if(r-l+1>p.length()){
                char left=s.charAt(l);
                if(pmap.containsKey(left)&& smap.get(left)<=pmap.get(left)){
                    count++;
                }
                smap.put(left,smap.get(left)-1);
                l++;
            }
            if(count==0){
                res.add(l);
            }
        }
        return res;
    }
}