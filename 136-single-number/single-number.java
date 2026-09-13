class Solution {
    public int singleNumber(int[] arr) {
    int p=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
        p=p^arr[i];
    }
    return p;
    }
}