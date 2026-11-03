class Solution {
    public String longestPalindrome(String s) {
      int n=s.length();
      int start=0,end=0;
      int len=0;
      for(int i=0;i<n;i++){
     int odd=ispal(s,i,i);
     int even=ispal(s,i,i+1);
     len=Math.max(odd,even);
     if(len>end-start){
        start=i-(len-1)/2;
        end=i+(len/2);
      }
      } 
      return s.substring(start,end+1);
    }
    private int ispal(String s,int left,int right){
        while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
        left--;
        right++; 
    }
    return right-left-1;
}
}