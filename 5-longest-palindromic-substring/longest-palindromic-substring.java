class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
              if(ispal(s,i,j)==true){
                if(j-i+1>str.length()){
                    str=s.substring(i,j+1);
                }
              }
            }
        }
        return str;
    }
    private boolean ispal(String s,int left,int right){
        while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
         return false;
        }
        left++;
        right--;
    }
    return true;
    }
}