class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n<4) return false;
        while(n > 1){
            int sum = 0;
            int temp = n;
            while(temp > 0 && n!=4){
                sum += (temp % 10) * (temp % 10);
                temp /= 10;
            }
            n = sum;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}