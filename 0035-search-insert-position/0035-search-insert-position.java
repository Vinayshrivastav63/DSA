class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int med = (low + high)/2;
            if(nums[med] == target){
                return med;
            }
            else if(nums[med] < target){
                low = low + 1;
            }
            else{
                high = high - 1;
            }
        }
        return low;

        
    }
}