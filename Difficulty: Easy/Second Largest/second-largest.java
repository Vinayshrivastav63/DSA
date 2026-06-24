class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int lar = arr[0];
        int sec = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] > lar){
                int temp = lar;
                lar = arr[i];
                sec = temp;
            }
            else if(arr[i] < lar && sec < arr[i]){
                sec = arr[i];
                
            }
        }
        return sec;
        
        
    }
}