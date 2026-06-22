class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int med = 0;
        int high = n-1;
        while(med <= high){
            if(nums[med]==0){
                swap(nums, low, med);
                low++;
                med++;
            }
            else if(nums[med]==1){
                med++;

            }else{
                swap(nums, med, high);
                high--;
            }
        }
        
    }
    public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
}