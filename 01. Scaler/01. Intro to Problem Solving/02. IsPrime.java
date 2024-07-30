// https://www.scaler.com/academy/mentee-dashboard/class/262131/assignment/problems/16066?navref=cl_tt_nv

class Solution {
    public int solve(int N) {
        int factors = countFactors(N);
        if(factors == 2) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int countFactors(int N) {
        int count = 0;
        for(int i = 1; i * i <= N; i++) {
            if(N % i == 0) {
                if(N / i == i) {
                    count++;
                }
                else {
                    count += 2;
                }
            }
        }

        return count;
    }
}
