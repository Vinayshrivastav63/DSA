class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int oneDelete = 0;
        int noDelete = arr[0];
        int res = arr[0];
        for(int i = 1; i < n; i++){
            int nextnoDelete = Math.max(arr[i], noDelete+arr[i]);
            int nextoneDelete = Math.max(noDelete, oneDelete+arr[i]);
            noDelete = nextnoDelete;
            oneDelete = nextoneDelete;
            res = Math.max(res, Math.max(oneDelete, noDelete));
        }
        return res;
        
    }
}