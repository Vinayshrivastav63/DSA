class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int largestElm = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] > largestElm)
            largestElm = arr[i];
        }
        return largestElm;
    }
}
