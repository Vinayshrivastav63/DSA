import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);
            
            int a = nums[i];
            int b = currentMax;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            prefixGcd[i] = a;
        }

        Arrays.sort(prefixGcd);

        long totalSum = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int a = prefixGcd[left];
            int b = prefixGcd[right];
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            totalSum += a;
            left++;
            right--;
        }

        return totalSum;
    }
}