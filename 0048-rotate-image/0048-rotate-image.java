class Solution {
    public void rotate(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i = 0; i<a.length; i++){
            int stCol = 0; 
            int endCol = a[0].length - 1;
            while(stCol<endCol){
                int temp = a[i][stCol];
                a[i][stCol] = a[i][endCol];
                a[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }

        
    }
}