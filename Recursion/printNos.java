package Recursion;

//Program to print 1 to N recursively
class Solution {

    public void printNos(int n) {
        // Your code here

        // Base condition to stop the recursion
        // if n==0 then we have to return the execution to main where recursion will
        // stop
        if (n == 0) {
            return;
        }
        // Else we'll call printNos(n-1) means to get values from 1 to N
        printNos(n - 1);
        System.out.print(n + " ");

    }
}

// Program to print N to 1 recursively
class Solution {

    void printNos(int N) {
        // code here
        if (N < 1) {
            return;
        }

        System.out.print(N + " ");
        printNos(N - 1);

    }
}