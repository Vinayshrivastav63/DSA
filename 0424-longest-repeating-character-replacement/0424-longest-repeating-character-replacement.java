class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0;
        int res = 0;
        int maxlen = 0;
        int[] arr = new int[256];
        for(int high = 0; high < n; high ++){
            arr[s.charAt(high) - 'A']++;
            res = Math.max(res, arr[s.charAt(high) - 'A']);
            // int len = high - low +1;
            // int diff = len - res;

            while( high - low +1 - res > k){
                arr[s.charAt(low) - 'A']--;
                low++;
            }   
                
            maxlen = Math.max(high - low +1, maxlen);

        }
        return maxlen;
    }
    // public int findMax(int[] arr){
    //     int max = 0;
    //     for(int i : arr){
    //         max = Math.max(max, i);
    //     }
    //     return max;
    // }
}