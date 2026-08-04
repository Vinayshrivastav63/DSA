class Solution {
    public int minimumRecolors(String s, int k) {
        int n = s.length();
        int w = 0;
        int l = 0;
        int r = k-1;
        for(int i = l; i <= r; i++){
            if(s.charAt(i) == 'W'){
                w++;
            }
        }
        int minw = w;
        for(int i = k; i < n; i++){
            if(s.charAt(i) == 'W'){
                w++;
            }
            if(s.charAt(i-k) == 'W'){
                w--;
            }
            minw = Math.min(minw, w);
        }
        return minw;
    }
}