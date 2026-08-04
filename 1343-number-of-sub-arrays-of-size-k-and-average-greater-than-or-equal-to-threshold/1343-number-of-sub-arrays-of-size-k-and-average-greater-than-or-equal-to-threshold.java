class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int t = k*threshold;
        int low = 0;
        int high = k-1;
        int sum = 0;
        int count = 0;
        for(int i = low; i <= high; i++){
            sum += arr[i];
            
        }
        if(sum >= t){
            count++;
        }
        

        for(int i = k; i < n; i++){
            sum += arr[i] - arr[i-k];
            if(sum >= t){
                count++;
            }
        }
        return count;
    }
}