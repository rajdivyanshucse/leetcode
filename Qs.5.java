// 5. Longest Palindromic Substring

import Java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int palinLength = 0;
        String ans = "";
        int maxLength = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1; j<=n ;j++){
               String subS = s.substring(i,j);
               if(isPalindrome(subS)){
                palinLength = subS.length();
                maxLength = Math.max(maxLength,palinLength);
                if(palinLength == maxLength){
                    ans = subS;
                }

               }

            }
        }
        return ans;
    }
    public boolean isPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n-1;

        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 == ch2){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}