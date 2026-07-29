class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n-1; 
        while(l < n-1 && arr[l] < arr[l+1]){
            l++;
        }
        while(r > 0 && arr[r] < arr[r-1]){
            r--;
        }
        return l != n-1 && r != 0 && l == r;
    }
}