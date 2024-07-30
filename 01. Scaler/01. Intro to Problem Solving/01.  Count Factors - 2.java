// https://www.scaler.com/academy/mentee-dashboard/class/262131/assignment/problems/29028/?navref=cl_pb_nv_tb

class Solution {
    public int solve(int N) {
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
