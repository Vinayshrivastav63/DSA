class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int sums = numbers[i] + numbers[j];
            if(sums == target){
                return new int[] {i+1, j+1};
            }
            else if(sums > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
    }
}