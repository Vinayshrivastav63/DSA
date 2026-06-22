class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int res = 0;
        HashMap <Character, Integer> map = new HashMap<> ();
        for(int high = 0; high < n; high++){
            char currentChar = s.charAt(high);
            map.put(currentChar, map.getOrDefault(currentChar, 0)+1);
            while(map.get(currentChar)>1){
                char charAtLow = s.charAt(low);
                map.put(charAtLow, map.get(charAtLow)-1);
                if(map.get(charAtLow)==0){
                    map.remove(charAtLow);
                }
                low++;
            }
            int len = high - low + 1;
            res = Math.max(len, res);
        }
        return res;
        
    }
}