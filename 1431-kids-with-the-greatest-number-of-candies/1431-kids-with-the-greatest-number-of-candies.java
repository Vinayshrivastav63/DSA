class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int n = nums.length;
        int num = nums[0];
        for(int i = 0; i<n;i++){
            if(nums[i] > num){
                num = nums[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(extraCandies + nums[i] >= num){
                res.add(true);
            }else{
                res.add(false);
            }
            

        }
        return res;
    }
}