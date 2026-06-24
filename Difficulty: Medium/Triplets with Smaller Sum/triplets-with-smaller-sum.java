class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i<n-2; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int currentSum = arr[i]+arr[l]+arr[r];
                if(currentSum < sum){
                    count += (r-l); 
                    l++;
                }else{
                    r--;
                }
            }
        }
        return count;
    }
}