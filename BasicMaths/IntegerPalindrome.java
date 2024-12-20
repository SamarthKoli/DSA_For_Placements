

class Solution {
    public boolean isPalindrome(int x) {
        
        int temp=x;

        int rev=0;

        while(temp>0){
            int d=temp%10;

            if(rev==0 && d==0){
                temp /= 10;
                continue;
            }
            rev=rev*10+d;
            temp=temp/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
