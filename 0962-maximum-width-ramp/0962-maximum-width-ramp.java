class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] rightMax = new int[n];

        // Step 1: Precompute the maximum values from right to left
        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        int maxWidth = 0;
        int left = 0;
        int right = 0;

        // Step 2: Two-pointer sliding window
        while (right < n) {
            // Expand right pointer as long as a valid ramp is possible
            while (left < right && nums[left] > rightMax[right]) {
                left++;
            }
            maxWidth = Math.max(maxWidth, right - left);
            right++;
        }

        return maxWidth;
    }
}