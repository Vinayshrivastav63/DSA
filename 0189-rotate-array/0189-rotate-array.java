class Solution {
    public void rotate(int[] nums, int k) {
  
        int n = nums.length;
        k = k % n;
        int i = n-k;
        int j = n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int m = 0;
        int l = n-k-1;
        while(m<l){
            int temp = nums[m];
            nums[m] = nums[l];
            nums[l] = temp;
            m++;
            l--;
        }
        int a = 0;
        int b = n-1;
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;

        }
        
        

      
        
      

        
    }
}