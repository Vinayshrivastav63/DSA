class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        return false;
        int org = x;
        int res = 0;
        while(x > 0){
            int num = x % 10;
            res = res * 10 + num;
            x /= 10;
        }
        if(res == org){
            return true;
        }else{
            return false;
        }
        
    }
}