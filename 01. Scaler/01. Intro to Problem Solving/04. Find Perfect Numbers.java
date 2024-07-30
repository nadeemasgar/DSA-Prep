// https://www.scaler.com/academy/mentee-dashboard/class/262131/homework/problems/29084?navref=cl_tt_lst_nm

class Solution {
    public int solve(int N) {
        if(N == 1) return 0;
        int sumOfFactors = calculateFactorSum(N);
       
        if(sumOfFactors == N) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int calculateFactorSum(int N) {
        int sum = 1;
        for(int i = 2; i * i <= N; i++) {
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
