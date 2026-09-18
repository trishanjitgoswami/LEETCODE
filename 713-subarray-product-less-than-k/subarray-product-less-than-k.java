class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int i=0;
        int n=arr.length;
        int count=0;
        int prod=1;
      if(k<=1) return 0;
      for(int j=0;j<n;j++){
        prod*=arr[j];
        while(prod>=k){
            prod/=arr[i];
            i++;
        }
        count+=j-i+1;
      }
      return count;
    }
}