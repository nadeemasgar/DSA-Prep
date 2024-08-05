// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int revNum = 0;
        while(temp > 0) {
            int digit = temp % 10;
            revNum = (revNum * 10) + digit;
            temp = temp / 10;
        }
        
        if(revNum == x) return true;
        else return false;
    }
}