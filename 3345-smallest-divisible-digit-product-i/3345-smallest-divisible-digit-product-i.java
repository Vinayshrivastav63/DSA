class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        int prod = 1;
        if(n <= t){
            return t;
        }
        while(temp > 0){
            prod *= temp % 10;
            temp /= 10;
        }
        if(prod % t != 0){
            for(int i = 1; i < n; i++){
                prod = 1;
                temp = n+i;
                while(temp > 0){
                    prod *= temp % 10;
                    temp /= 10;
                }
                if(prod % t == 0){
                    return n+i;
                }

            }
        }
        return n;
       
        
    }
}