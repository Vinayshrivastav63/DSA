class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int bestmax = nums[0];
        int bestmin = nums[0];
        int sumMax = nums[0];
        int sumMin = nums[0];
        int totalsum = nums[0];
        int res = nums[0];

        for(int i = 1; i < n; i++){
            bestmax = Math.max(bestmax + nums[i], nums[i]);
            bestmin = Math.min(bestmin + nums[i], nums[i]);
            sumMax = Math.max(sumMax, bestmax);
            sumMin = Math.min(sumMin, bestmin);
            totalsum += nums[i];

        }
        if(sumMax < 0){
            return sumMax;
        }
        int normalMax = sumMax;
        int circularMax = totalsum - sumMin;
        return Math.max(normalMax, circularMax);
        

        
    }
}