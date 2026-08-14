class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int ans = 0;

        while(x > 0){
            int lastnum = x%10;
            ans = ans * 10 + lastnum ;
            x = x/10;
        }

        if( num == ans ){
            return true;
        }
        return false;

    }
}