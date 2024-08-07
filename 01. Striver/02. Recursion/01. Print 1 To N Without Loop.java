// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

class Solution
{
    
    public void printNos(int N)
    {
        reccursiveSol(1, N);
    }
    
    public void reccursiveSol(int i, int N) {
        if(i > N) return;
        
        System.out.print(i + " ");
        reccursiveSol(i + 1, N);
    }
}
