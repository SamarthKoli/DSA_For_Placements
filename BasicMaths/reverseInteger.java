package BasicMaths;

class Solution {
    public int reverse(int x) {
        
      int temp=x;
      int rev=0;
      while(temp!=0){
        //getting last digit from number
        int d=temp%10;
        //checking for traling zeros
       if (rev == 0 && d == 0) {
            temp /= 10;
            continue;
        }
        //checking for overflow condition in java 
         if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; 
        }
        //Storing last digit into new integer to reverse it 
          rev=rev*10+d;
          temp=temp/10;

       

      }
      return rev;


    }
}