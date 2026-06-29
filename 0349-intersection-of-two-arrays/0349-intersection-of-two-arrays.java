import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, true);
        }
        
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultList.add(num);
                map.remove(num); 
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}