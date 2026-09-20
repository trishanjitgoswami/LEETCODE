class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int val=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
       if(h.get(i)>n/2){
        val=i;
       }
        }
        return val;
    }
}