class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                arr.add(index+1);
            }else{
                nums[index] = -nums[index];

            }
        }
        return arr;
    }
}