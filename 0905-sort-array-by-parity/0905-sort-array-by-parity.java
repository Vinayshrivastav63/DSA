class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int start = 0;
        int end = n - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                res[start++] = num; 
            } else {
                res[end--] = num;   
            }
        }
        return res;
    }
}