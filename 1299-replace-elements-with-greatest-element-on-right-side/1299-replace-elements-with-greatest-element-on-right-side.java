class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n == 1) return new int[]{-1};
       
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = i+1; j < n; j++){
                max = Math.max(max, arr[j]);
            }
            res[i] = max;
        }
        res[n-1] = -1;
        return res;


        
        
    }
}