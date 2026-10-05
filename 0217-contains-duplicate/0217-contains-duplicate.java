class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int curr = nums[i];
            map.put(curr, map.getOrDefault(curr, 0)+1);

        }
        for(int i = 0; i < n; i++){
            if(map.get(nums[i]) > 1) return true;
        }
        return false;

        
    }
}