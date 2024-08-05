// https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

class Solution{
    static long sumOfDivisors(int N){
        long res = 0;
        for(int i = 1; i <= N; i++) {
            res += countfactorSum(i);
        }
        
        return res;
    }
    
    static long countfactorSum(int N) {
        long sum = 0;
        for(int i = 1; i * i <= N; i++) {
            if(N % i == 0) {
                sum += i;
                if(N / i != i) {
                    sum += N / i; 
                }
            }
        }
        
        return sum;
    }
}