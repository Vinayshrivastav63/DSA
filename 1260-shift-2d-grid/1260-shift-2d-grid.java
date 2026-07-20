import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        k = k % total;
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>());
        }
        
        for (int i = 0; i < total; i++) {
            int original1D = (i - k + total) % total;
            int originalR = original1D / n;
            int originalC = original1D % n;
            
            int resultR = i / n;
            result.get(resultR).add(grid[originalR][originalC]);
        }
        
        return result;
    }
}