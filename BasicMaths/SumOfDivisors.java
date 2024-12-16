class Solution {
    public static int sumOfDivisors(int n) {
        
         int totalSum = 0;

        // Iterate over all potential divisors
        // if n=4 
        // i=1 1*4=4
        // i=2 2*2=4
        //and so on...
        for (int i = 1; i <= n; i++) {
            // Add i times the number of multiples of i
            totalSum += i * (n / i);
        }

        return totalSum;
       
    }
}