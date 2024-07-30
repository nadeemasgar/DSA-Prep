// https://www.scaler.com/academy/mentee-dashboard/class/262127/homework/problems/12826/submissions

class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];

        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + A[i];
        }

        int[] suffixSum = new int[n];
        suffixSum[n - 1] = A[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + A[i];
        }

        for(int i = 0; i < n; i++) {
            if(prefixSum[i] == suffixSum[i]) return i;
        }

        return -1;
    }
}
