class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]); 
        }
        if(s.size()==nums.length){
            return false;
        }
        return true;
    }
}