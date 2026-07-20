class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {

            // Character doesn't exist in the map
            if (!map.containsKey(ch)) {
                return false;
            }

            // Decrease its frequency
            map.put(ch, map.get(ch) - 1);

            // If frequency becomes 0, remove it
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        return map.isEmpty();

    }
}
