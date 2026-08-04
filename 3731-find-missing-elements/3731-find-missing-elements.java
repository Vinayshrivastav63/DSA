class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = nums[0];
        int min = nums[0];
        for(int num : nums){
            set.add(num);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}