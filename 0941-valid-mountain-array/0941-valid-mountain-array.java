class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l < r && arr[l] < arr[l+1]){

                l++;
        }
        int i = 0;
        int j = n-1;
        while(i < j && arr[j] < arr[j-1]){

                j--;
            
        }
        return l != 0 && j != n-1 && l == j;
        
    }
}