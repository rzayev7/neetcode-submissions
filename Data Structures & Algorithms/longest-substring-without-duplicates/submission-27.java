class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder("");
        int max=0;
        if(s.length() == 1){
            return 1;
        }
        char[] str = s.toCharArray();
        for(int i=0;i<s.length();i++){
            while(sb.toString().contains(String.valueOf(str[i]))){
                sb.deleteCharAt(0);
            }
            sb.append(str[i]);
            if(max<sb.length()){
                max = sb.length();
            }
            System.out.println(sb);
        }
        return max;                                                
    }
}
