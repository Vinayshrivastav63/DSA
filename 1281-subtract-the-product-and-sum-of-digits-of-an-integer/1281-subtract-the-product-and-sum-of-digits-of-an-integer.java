class Solution {
    public int subtractProductAndSum(int n) {
        int tem1 = n;
        int tem2 = n;
        int prod = 1;
        int sum = 0;
        while(tem1 > 0){
            prod *= tem1 % 10;
            tem1 /= 10;
        }
        while(tem2 > 0){
            sum += tem2 % 10;
            tem2 /= 10;
        }
        return prod - sum;
        
    }
}