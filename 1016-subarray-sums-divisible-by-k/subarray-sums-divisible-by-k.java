class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        Map<Integer,Integer>h=new HashMap<>();
        h.put(0,1);
        int n=arr.length;
       int count=0;
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=arr[i];
        int rem=sum%k;
        if(rem<0) rem+=k;
        if(h.containsKey(rem)){
            count+=h.get(rem);
        }
        h.put(rem,h.getOrDefault(rem,0)+1);
       }
       return count;
    }
}