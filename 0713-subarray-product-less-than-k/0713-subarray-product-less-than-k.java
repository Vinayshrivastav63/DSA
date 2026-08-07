class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        
        int low = 0;
        int n = nums.length;
        long mul = 1;
        int count = 0;
        
        for (int high = 0; high < n; high++) {
            mul *= nums[high];
            
            while (mul >= k) {
                mul /= nums[low];
                low++;
            }
            
            count += (high - low + 1);
        }
        
        return count;
    }
}