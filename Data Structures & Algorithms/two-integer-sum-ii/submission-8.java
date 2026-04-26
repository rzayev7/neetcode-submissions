class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]>target){
                r--;
            }
            else if(numbers[l]+numbers[r]<target){
                l++;
            }
            else{
                l++;
                r++;
                return new int[]{l,r};
            }
        }
        return new int[]{l,r};
    }
}
