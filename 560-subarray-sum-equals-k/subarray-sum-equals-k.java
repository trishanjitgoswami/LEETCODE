class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        int count=0;
        Map<Integer,Integer>h=new HashMap<>();
        h.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int target=sum-k;
            if(h.containsKey(target)){
                count+=h.get(target);
            }
             h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}