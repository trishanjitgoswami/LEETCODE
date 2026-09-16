class Solution {
    public int trap(int[] height) {
        int n=height.length;
       int i=0,j=n-1;
       int leftmax=height[i];
       int rightmax=height[j];
       int area=0;
       while(i<j){
        if(leftmax<rightmax){
              i++;
            leftmax=Math.max(leftmax,height[i]);
            area=area+leftmax-height[i];
          
        }else{
            j--;
            rightmax=Math.max(rightmax,height[j]);
            area+=rightmax-height[j];
        }
       }
       return area;
    }
}