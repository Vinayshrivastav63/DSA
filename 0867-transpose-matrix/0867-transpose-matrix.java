class Solution {
    public int[][] transpose(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int [][] b = new int [col][row];
        for(int i = 0; i < row ; i++){
            for(int j = 0; j<col; j++){
                b[j][i] = a[i][j];
            }
        }
        return b;
        
    }
}