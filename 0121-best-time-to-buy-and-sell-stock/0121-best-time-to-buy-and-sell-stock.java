class Solution {
    public int maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
            }else{
                int profit = nums[i] - min;
                max = Math.max(max, profit);
            }
        }
        return max;
        
    }
}