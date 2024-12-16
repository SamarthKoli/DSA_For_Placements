class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int lcmgcd[]=new int[2];
        int lcm=0;
        int gcd=1;
        //Calculate GCD (Greatest Common Divisor)
        //Here to we choose Min(a,b) to calculate to avoid unescessary checks for division
        //For all numbers there is a common divisor that is '1' which is initilized in gcd before calculatig final value
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a%i==0 && b%i==0) {
                gcd=i;
                
                
            }

        }
        //Calculate LCM using value of GCD
        lcm=(a/gcd*b);
        //Storing values of LCM and GCD in result Array
        lcmgcd[0]=lcm;
        lcmgcd[1]=gcd;

        return lcmgcd;
       

        
        
        
        
    }
}