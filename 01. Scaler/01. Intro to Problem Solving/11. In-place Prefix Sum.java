// https://www.scaler.com/academy/mentee-dashboard/class/262127/homework/problems/29398?navref=cl_tt_lst_nm

class Solution {
    public int[] solve(int[] A) {
        for(int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }

        return A;
    }
}
