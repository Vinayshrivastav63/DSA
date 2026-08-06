class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int Curr = arr[i];
            map.put(Curr, map.getOrDefault(Curr, 0)+1);
        }
        Set<Integer> set = new HashSet<> (map.values());
        return map.size() == set.size();
        
        
    }
}