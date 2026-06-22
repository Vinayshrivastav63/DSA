class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int remaining = target - currentNum;
            
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }
            
            map.put(currentNum, i);
        }
        
        return new int[] {};
    }
}