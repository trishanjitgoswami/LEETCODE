class Solution {
    public int longestOnes(int[] arr, int k) {
        int i=0;
        int n=arr.length;
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){count++;}
            if(count>k){
                if(arr[i]==0){
                    count--;
                }
                i++;
            }
           
        }
        return n-i;
    }

    
}