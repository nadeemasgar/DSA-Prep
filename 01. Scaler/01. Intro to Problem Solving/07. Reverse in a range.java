// https://www.scaler.com/academy/mentee-dashboard/class/262129/assignment/problems/29129?navref=cl_tt_lst_nm

class Solution {
    public int[] solve(int[] A, int B, int C) {
        int i = B;
        int j = C;

        while(i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }

        return A;
    }
}
