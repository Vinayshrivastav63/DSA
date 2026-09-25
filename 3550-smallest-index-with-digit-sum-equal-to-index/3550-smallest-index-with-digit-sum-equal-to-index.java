class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int digit = 0;
            int temp = nums[i];
            if(nums[i] <= 9){
                if(nums[i] == i) return i;
            }else{
                while(temp > 0){
                    digit += temp % 10;
                    temp /= 10; 
                }
                if(digit == i) return i;   
            }
        }
        return -1;
    }
}