class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=total-left-arr[i];
            if(left==right) return i;
            left+=arr[i];
        }
        return -1;
    }
}