class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase().replaceAll("[^a-z0-9]","");
       return rev(s);
    }
         int i=0;
         boolean rev (String s){
            int n=s.length();
            if(i>=n/2) return true;
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
            i++;
            return rev( s);
        }
           }
