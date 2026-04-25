class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            if(!set.contains(nums[i]-1)){
                int current = nums[i];
                while(set.contains(current)){
                    count++;
                    current++;
                }
            }
            if(count>max){
                max = count;
            }

        }
        return max;
    }
}
