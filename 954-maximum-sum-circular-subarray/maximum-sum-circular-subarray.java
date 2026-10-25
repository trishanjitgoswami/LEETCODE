class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n=arr.length;
        int sum=0;
       int max=arr[0];
       int total=0;
       int currmin=0;
       int min=arr[0];
       for(int i=0;i<n;i++){
        sum+=arr[i];
        max=Math.max(max,sum);
        if(sum<0) {
            sum=0;
        }
        currmin=Math.min(arr[i],currmin+arr[i]);
        min=Math.min(currmin,min);
        total+=arr[i];
       }
       if(max<0) return max;
       return Math.max(max,total-min);
    }
}