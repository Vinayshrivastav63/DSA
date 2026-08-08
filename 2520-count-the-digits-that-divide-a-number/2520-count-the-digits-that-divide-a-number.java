class Solution {
    public int countDigits(int num) {
        int tem = num;
        int count = 0;
        int res = 0;
        while(num > 0){
            // sum += num % 10;
            res = num % 10;
            num /= 10;
            if(tem % res == 0){
                count++;
            }

        }
        return count;
        
    }
}