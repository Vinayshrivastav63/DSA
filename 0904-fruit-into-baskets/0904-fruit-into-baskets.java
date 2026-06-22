class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();
        for(int high = 0; high < n; high++){
            int currentFruit = fruits[high];
            map.put(currentFruit, map.getOrDefault(currentFruit, 0)+1);
            while(map.size() > 2){
                int fruitAtLow = fruits[low];
                map.put(fruitAtLow, map.get(fruitAtLow)-1);
                if(map.get(fruitAtLow)==0){
                    map.remove(fruitAtLow);
                }
                low++;
            }
            int len = high - low + 1;
            res = Math.max(res , len);

        }
        return res;

        
    }
}