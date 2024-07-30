// https://www.scaler.com/academy/mentee-dashboard/class/262129/assignment/problems/29098/

class Solution {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        B = B % n;
        reverse(A, 0, n - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);

        return A;
    }

    public void reverse(int[] A, int i, int j) {
        while(i <= j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }
    }
}
