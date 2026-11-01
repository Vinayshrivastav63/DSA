import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        );

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {

            int element = i.getKey();
            int freq = i.getValue();

            int[] curr = {freq, element};

            if (pq.size() < k) {
                pq.offer(curr);
                continue;
            }

            if (curr[0] < pq.peek()[0]) {
                continue;
            }

            pq.poll();
            pq.offer(curr);
        }

        int[] res = new int[k];
        int index = 0;

        while (!pq.isEmpty()) {
            res[index] = pq.peek()[1];
            index++;
            pq.poll();
        }

        return res;
    }
}