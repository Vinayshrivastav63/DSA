class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > f) {
                t = s;
                s = f;
                f = nums[i];
            } else if (nums[i] > s) {
                t = s;
                s = nums[i];
            } else if (nums[i] > t) {
                t = nums[i];
            }

            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

        return Math.max(f * s * t, f * min1 * min2);
    }
}