class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = -1;
        
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        for(int j = 0; j<n; j++){
            if(arr[j] > smax && arr[j] != max){
                smax = arr[j];
            }
        }
        
        return smax;
        // code here
        
    }
}