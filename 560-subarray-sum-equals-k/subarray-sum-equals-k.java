class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int curr_sum = 0;

        for(int i : nums){
            curr_sum = curr_sum + i;

            int diff = curr_sum - k;

            if(map.containsKey(diff)){
                count = count + map.get(diff);
            }

            map.put(curr_sum, map.getOrDefault(curr_sum, 0)+1);
        }
        return count;
    }
}