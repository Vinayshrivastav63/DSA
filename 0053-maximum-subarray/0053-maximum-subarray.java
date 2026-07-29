class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int prev = 0;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int v1 = nums[i];
            int v2 = prev + nums[i];
            prev = Math.max(v1, v2);
            res = Math.max(res, prev);
        }
        return res;
    }
}