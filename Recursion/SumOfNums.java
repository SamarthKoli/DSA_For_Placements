package Recursion;

//Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

class Solution {
    public int sumOfSeries(int n) {
       
        if (n == 0) {
            return 0;
        }
        //here we can see that we have n^3+f(n-1) pattern where n is current sum to calculated and f(n-1) denotes upcoming term passed to sum function to calculate sum
    
       
        return n*n*n + sumOfSeries(n - 1);
    }
}
