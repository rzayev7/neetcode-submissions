class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();

        
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            int current = i + 1;

            while(current < nums.length && nums[i] == nums[current]){
                count++;
                current++;
            }

            map.put(nums[i], count);
            i = current - 1;
        }

        List<Integer>[] arr = new ArrayList[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);

            if(arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }

            arr[freq].add(key);
        }

        int[] out = new int[k];
        int count = 0;

        for(int i = arr.length - 1; i >= 0 && count < k; i--){
            if(arr[i] != null){
                for(int num : arr[i]){
                    out[count] = num;
                    count++;

                    if(count == k) break;
                }
            }
        }

        return out;
    }
}