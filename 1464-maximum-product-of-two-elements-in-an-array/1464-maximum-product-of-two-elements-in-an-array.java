class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > f){
                s = f;
                f = nums[i];
            }
            else if(nums[i] > s){
                s = nums[i];
            }
        } 
        return (f-1)*(s-1);
    }
}