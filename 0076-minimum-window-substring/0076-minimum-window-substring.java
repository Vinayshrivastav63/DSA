class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        int count = t.length();

        while (end < s.length()) {
            char cEnd = s.charAt(end);
            if (map[cEnd] > 0) {
                count--;
            }
            map[cEnd]--;
            end++;

            while (count == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    minStart = start;
                }

                char cStart = s.charAt(start);
                map[cStart]++;
                if (map[cStart] > 0) {
                    count++;
                }
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}