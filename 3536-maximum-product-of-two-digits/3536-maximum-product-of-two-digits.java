class Solution {
    public int maxProduct(int n) {
        int f = 0;
        int s = 0;
        while(n > 0){
            int num = n % 10;
            if(num > f){
                s = f;
                f = num;
            }else if(s < num){
                s = num;
            }
            n /= 10; 
        }
        return f * s;


        
    }
}