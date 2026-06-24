class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Do arrays banaye left aur right products track karne ke liye
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        
        // 1. Left array fill karo (Prefix Product)
        // Sabse pehle element ke left me kuch nahi hota, toh 1 rakh diya
        left[0] = 1; 
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        // 2. Right array fill karo (Suffix Product)
        // Sabse aakhiri element ke right me kuch nahi hota, toh 1 rakh diya
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        // 3. Dono ko multiply karke final answer bana lo
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
}