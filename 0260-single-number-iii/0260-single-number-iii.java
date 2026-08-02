class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int x = 0;
        for(int i = 0; i < n; i++){
            x ^= nums[i];
        }
        int mask = x & -x;
        int f = 0;
        int s = 0;
        for(int i = 0; i < n; i++){
            if((mask & nums[i]) == 0){
                f ^= nums[i];
            }else{
                s ^= nums[i];
            }
        }
        return new int[]{f, s};

        
    }
}