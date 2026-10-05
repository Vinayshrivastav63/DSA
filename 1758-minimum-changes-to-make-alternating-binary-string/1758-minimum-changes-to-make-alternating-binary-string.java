class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int changes = 0;

        for (int i = 0; i < n; i++) {
           
            if(i % 2 == 0){
                if (s.charAt(i) != '0') {
                    changes++;
                }
            }else{ 
                if (s.charAt(i) != '1') {
                    changes++;
                }
            }
        }
        return Math.min(changes, n - changes);
    }
}