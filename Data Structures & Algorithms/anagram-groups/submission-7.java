class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String i:strs){
            int[] count = new int[26];
            for(char c:i.toCharArray()){
                count[c-'a']++;
            }
            // [1 0 1 0 0 0 ... 1]
            String key = Arrays.toString(count);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(i);
        }
        return new ArrayList<>(map.values());
    }
}
