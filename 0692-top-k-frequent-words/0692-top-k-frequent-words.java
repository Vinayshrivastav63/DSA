
class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: PriorityQueue
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!map.get(a).equals(map.get(b))) {
                    return Integer.compare(map.get(b), map.get(a));
                }

                return a.compareTo(b);
            }
        );

        // Step 3: Add elements to heap
        for (String word : map.keySet()) {
            pq.add(word);
        }

        // Step 4: Extract top K
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }

        return ans;
    }
}
