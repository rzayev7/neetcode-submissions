class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4 -1 -1 0 1 2
        Arrays.sort(nums); 
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int a = nums[i];
            if(i>=1 && nums[i-1]==a){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
             
            while(l<r){
                int b = nums[l];
                int c = nums[r];
                if(a+b+c==0){
                     list.add(Arrays.asList(a,b,c));
                     l++;
                     r--;
                     while(l<r && nums[l]==nums[l-1]){
                        l++;
                     }
                     while(l<r && nums[r]==nums[r+1]){
                        r--;
                     }

                }
                if(a+b+c<0){
                    l++;
                }
                else if(a+b+c>0){
                    r--;
                }
            }
        }
        return list;
    }
}
