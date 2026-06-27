class Solution {

    private long fun(int[] a, int speed) {
        long h = 0;
        for (int i = 0; i < a.length; i++) {
            h += a[i] / speed;
            if (a[i] % speed != 0) {
                h++;
            }
        }
        return h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        
        int res = -1;
        
        while (low <= high) {
            int guess = low + (high - low) / 2;
            long hour = fun(piles, guess);
            
            if (hour > h) {
                low = guess + 1;
            } else {
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
}