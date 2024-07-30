// https://www.scaler.com/academy/mentee-dashboard/class/262127/assignment/problems/12828/submissions

class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int[] prefixEven = new int[n];
        
        prefixEven[0] = A[0];
        for(int i = 1; i < n; i++) {
            if(i % 2 == 0) {
                prefixEven[i] = prefixEven[i-1] + A[i];
            }
            else {
                prefixEven[i] = prefixEven[i-1];
            }
        }

        int[] prefixOdd = new int[n];
        prefixOdd[0] = 0;

        for(int i = 1; i < n; i++) {
            if(i % 2 == 1) {
                prefixOdd[i] = prefixOdd[i-1] + A[i];
            }
            else {
                prefixOdd[i] = prefixOdd[i-1];
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                // sum of even indexed elements after removing ith indexed element
                int sumOfEvenIndex = prefixOdd[n-1] - prefixOdd[i];
                // sum of odd indexed elements after removing ith indexed element
                int sumOfOddIndex = prefixEven[n-1] - prefixEven[i];
                if(sumOfEvenIndex == sumOfOddIndex) count++;
            }
            else {
                // sum of even indexed elements after removing ith indexed element
                int sumOfEvenIndex = prefixEven[i-1] + (prefixOdd[n-1] - prefixOdd[i]);
                // sum of odd indexed elements after removing ith indexed element
                int sumOfOddIndex = prefixOdd[i-1] + (prefixEven[n-1] - prefixEven[i]);
                if(sumOfEvenIndex == sumOfOddIndex) count++;
            }
        }

        return count;

    }
}
