class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
       return ans(arr,k)-ans(arr,k-1);
    }
    private int ans(int arr[],int k){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int result=0;
        for(int r=0;r<n;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.size()>k){
         map.put(arr[l],map.get(arr[l])-1);
         if(map.get(arr[l])==0) {
          map.remove(arr[l]);
         }
         l++;
            }
            result+=r-l+1;
        }
      return result;  
    }
}