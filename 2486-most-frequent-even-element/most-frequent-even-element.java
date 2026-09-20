class Solution {
    public int mostFrequentEven(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            if(i%2==0){
                h.put(i,h.getOrDefault(i,0)+1);
            }
        }
        int max=0;
        int val=-1;
    for(int i:h.keySet()){
if(h.get(i)>max){
    max=h.get(i);
    val=i;
}else if(h.get(i)==max && i<val){
val=i;
}
    }
     return val;
    }
}