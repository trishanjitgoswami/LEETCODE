class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<n && j>=0){
            if(arr[i]+arr[j]>target){
                j--;
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
return new int[] {i+1,j+1};
            }
        }
        return new int[]{-1,-1};
     }
    }