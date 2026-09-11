class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
       ArrayList<Integer> temp=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(arr[i]!=0){
            temp.add(arr[i]);
        }
       }
       for(int i=0;i<temp.size();i++){
        arr[i]=temp.get(i);
       }
       int x=temp.size();
       for(int i=x;i<n;i++){
        arr[i]=0;
       }
    }
}