class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int n=arr.length;
        int max=0;
        int sum_max=0;
        int min=0;
        int sum_min=0;
        for(int i=0;i<n;i++){
            sum_max+=arr[i];
            max=Math.max(sum_max,max);
            if(sum_max<0) sum_max=0;
            sum_min+=arr[i];
            min=Math.min(min,sum_min);
            if(sum_min>0) sum_min=0;
        }
        return Math.max(max,-min);
    }
}