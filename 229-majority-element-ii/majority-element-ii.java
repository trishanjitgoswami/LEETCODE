class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer>p=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        int n=arr.length;
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>n/3){
                p.add(i);
            }
        }
        return p;
    }
}