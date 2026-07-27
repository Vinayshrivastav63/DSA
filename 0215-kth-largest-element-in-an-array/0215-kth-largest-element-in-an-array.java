class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> map = new PriorityQueue<>();
        for(int num : nums){
            map.add(num);
            if(map.size() > k){
                map.poll();
            }
        }
        return map.peek();
        
    }
}