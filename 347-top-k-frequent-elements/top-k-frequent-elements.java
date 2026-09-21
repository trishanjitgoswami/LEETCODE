class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int r[]=new int[k];
        for(int j=0;j<k;j++){
         int max=0;
        int val=0;
            for(int i:h.keySet()){
                if(h.get(i)>max){
                    max=h.get(i);
                    val=i;
                }
            }
            r[j]=val;
            h.remove(val);
        }
        return r;
    }
}