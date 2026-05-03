class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int count=0;
        char[] str = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            while(set.contains(str[i])){
                set.remove(str[count]);
                count++;
            }
            set.add(str[i]);
            if(max<set.size()){
                max = set.size();
            }
        }                        
        return max;                    
    }
}
