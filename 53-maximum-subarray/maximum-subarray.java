class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int  sum=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
       sum+=arr[i];
       max=Math.max(max,sum);
       if(sum<0) sum=0;
        }
        return max;
    }
}