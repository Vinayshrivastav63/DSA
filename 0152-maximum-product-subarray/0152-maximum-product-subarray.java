class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int posEnd = nums[0];
        int negEnd = nums[0];
        int res = nums[0];
        for(int i = 1; i < n; i++){
            int v1 = nums[i];
            int v2 = posEnd * nums[i];
            int v3 = negEnd * nums[i];

            posEnd = Math.max(v1, Math.max(v2, v3));
            negEnd = Math.min(v1, Math.min(v2, v3));
            res = Math.max(res, Math.max(posEnd, negEnd));
        }
        return res;
        
    }
}