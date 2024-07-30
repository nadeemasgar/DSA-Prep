// https://www.scaler.com/academy/mentee-dashboard/class/262131/homework/problems/6779?navref=cl_tt_nv

class Solution {
    public int solve(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(countPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean countPrime(int N) {
        int factors = countFactors(N);
        if(factors == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int countFactors(int N) {
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
