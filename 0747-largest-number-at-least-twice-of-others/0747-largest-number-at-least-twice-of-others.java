class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > lar){
                sec = lar;
                lar = nums[i];
            }
            else if(nums[i] > sec && nums[i] < lar){
                sec = nums[i];
            }  
        }
        if(lar >= 2*sec){
            for(int i = 0; i < n; i++){
                if(lar == nums[i]){
                    return i;
                }
            }
        }
        return -1;  
    }
}