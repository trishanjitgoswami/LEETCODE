class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
         k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[(n-k)+i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
            
        }
        
    }
}