// https://www.scaler.com/academy/mentee-dashboard/class/262129/assignment/problems/11160/

import java.util.*;
class Solution {
    public int solve(int[] A, int B) {
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = i + 1; j < A.length; j++) {
                if(A[i] + A[j] == B) {
                    return 1;
                }
            }
        }

        return 0;
    }
}

class OptimisedApproach {
    public int solve(int[] N, int B) {
        Arrays.sort(N);
        int i = 0, j = N.length - 1;
        while(i < j) {
            if(N[i] + N[j] == B) {
                return 1;
            } 
            else if(N[i] + N[j] > B) {
                j--;
            }
            else {
                i++;
            }
        }

        return 0;
    }
}

