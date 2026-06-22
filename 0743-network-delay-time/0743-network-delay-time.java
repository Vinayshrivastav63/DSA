import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] time : times) {
            adj.computeIfAbsent(time[0], x -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        minHeap.offer(new int[]{k, 0});

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        boolean[] visited = new boolean[n + 1];
        int count = 0;
        int maxTime = 0;

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int u = curr[0];
            int time = curr[1];

            if (visited[u]) continue;
            visited[u] = true;
            count++;
            maxTime = time;

            if (count == n) return maxTime;

            if (adj.containsKey(u)) {
                for (int[] edge : adj.get(u)) {
                    int v = edge[0];
                    int w = edge[1];
                    if (!visited[v] && time + w < dist[v]) {
                        dist[v] = time + w;
                        minHeap.offer(new int[]{v, dist[v]});
                    }
                }
            }
        }

        return count == n ? maxTime : -1;
    }
}