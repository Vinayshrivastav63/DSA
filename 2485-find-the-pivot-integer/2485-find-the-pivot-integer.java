class Solution {
    public int pivotInteger(int n) {
        if(n <= 1){
            return 1;
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        } 
        int left = 0;
        for(int i = 2; i <= n; i++){
            left += i-1;
            int right = sum - left - i;
            if(left == right){
                return i;
            }
        }
        return -1;
        
    }
}