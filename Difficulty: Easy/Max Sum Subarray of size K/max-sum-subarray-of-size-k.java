class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        if(k>n)
        return -1;
        
        int low = 0;
        int high = k-1;
        int sum = 0;
        
        for(int i = 0; i <= high; i++){
            sum += arr[i];
        }
        int res = sum;
        while(high < n){
            res = Math.max(sum, res);
            low++;
            high++;
            
            if(high == n)
            break;
            
            sum = sum - arr[low - 1];
            sum = sum + arr[high];
            
        }
        return res;
    }
}