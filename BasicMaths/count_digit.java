

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        //store original number for comparision
        int temp=n;
       while(temp>0){
        //Getting last digit of number
           int d=temp%10;
           //check if 0 exists to avoid it and checking given number evenly divides current digit
           if(d!=0 && n%d==0){
               count++;
            
           }
            //remove last digit 
           temp=temp/10;
       }
       //return total count of evenly Divided digits
        return count;
       
    }
}