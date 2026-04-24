class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        // sort
        Arrays.sort(arr);
        Arrays.sort(arr2);

        // convert back to string
        String sorted = new String(arr);
        String sorted2 = new String(arr2);

        if(sorted.equals(sorted2)){
            return true;
        }
        return false;
    }
}
