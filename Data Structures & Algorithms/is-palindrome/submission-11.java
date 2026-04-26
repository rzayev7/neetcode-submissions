class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder out = new StringBuilder();

        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                out.append(Character.toLowerCase(i));
            }
        }
        String cleaned = out.toString();
        String reversed = out.reverse().toString();

        return cleaned.equals(reversed);
    }
}
