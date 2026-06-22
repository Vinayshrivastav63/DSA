class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        
        sum -= nums[0]; 
        if(sum == 0)
            return 0;
            
        sum += nums[0]; 

        int left = 0;
        for(int i = 1; i < n; i++){
            left += nums[i-1];
            int right = sum - nums[i] - left;
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}