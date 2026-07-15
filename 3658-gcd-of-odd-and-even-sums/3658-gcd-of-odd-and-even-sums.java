class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        // int totalSum = 0;
        for(int i = 1; i <= 2*n; i++){
            if(i%2 == 0){
                sumEven += i;

            }else{
                sumOdd += i;
            }
        }

        for(int i = n; i > 0; i--){
            if((sumEven % i == 0 ) && (sumOdd % i == 0)){
                return i;
            }
        }
        return 1;
    }
}