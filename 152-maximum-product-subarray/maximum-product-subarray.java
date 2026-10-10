class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
                     int prod=1;
      for(int j=i;j<n;j++){
        prod*=arr[j];
max=Math.max(prod,max);
      }
        }
        return max;
    }
}