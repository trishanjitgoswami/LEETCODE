class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        int n=arr.length;
        Map<Integer,Integer>h=new HashMap<>();
        h.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
       sum+=arr[i];
       int rem=sum%k;
       if(h.containsKey(rem)){
        if(i-h.get(rem)>=2) return true;}
       else{
        h.put(rem,i);
       }
        }
        return false;
    }
}