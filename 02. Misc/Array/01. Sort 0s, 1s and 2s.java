// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int i = 0, j = 0, k = a.length - 1;
        
        while(j <= k) {
            if(a[j] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                
                i++;
                j++;
            }
            else if(a[j] == 1) {
                j++;
            }
            else {
                int temp = a[k];
                a[k] = a[j];
                a[j] = temp;
            
                k--;
            }
        }
    }
}