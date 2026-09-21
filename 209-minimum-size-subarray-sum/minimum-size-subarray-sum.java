class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int sum=0;
        int l=0;
        int result=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
        sum+=arr[r];
        while(sum>=target){
           int len=r-l+1;
        result=Math.min(result,len);
        sum-=arr[l];
        l++;
        }
        }
        if(result==Integer.MAX_VALUE) return 0;
        else return result;
    }
}