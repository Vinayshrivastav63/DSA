class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int Curr = arr[i];
            map.put(Curr, map.getOrDefault(Curr, 0)+1);
        }
        int max1 = -1;
        for(int num : arr){
            if(map.get(num) == num){
                max1 = Math.max(max1, num);
            }
        }
        return max1;
        
        
    }
}