// https://www.geeksforgeeks.org/problems/count-digits5716/1

class Solution {
    static int evenlyDivides(int N){
        int count = 0;
        
        int temp = N;
        while(temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            if((digit != 0) && (N % digit == 0)) count++;
        }
        
        return count;
    }
}