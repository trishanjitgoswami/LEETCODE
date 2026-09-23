class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int res[]=new int[n-k+1];
        Deque <Integer>d=new LinkedList<>();
        for(int r=0;r<n;r++){
            while(!d.isEmpty()&& d.peekFirst()<=r-k){
                d.pollFirst();
            }
            while(!d.isEmpty()&& arr[d.peekLast()]<arr[r]){
                d.pollLast();
            }
            d.addLast(r);
            if(r>=k-1){
                res[r-k+1]=arr[d.peekFirst()];
            }
        }
        return res;
    }
}