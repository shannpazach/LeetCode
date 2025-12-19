class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        Integer[] new_array = new Integer[nums.length];
        for(int i = 0;i<nums.length;i++){
            new_array[i] = nums[i];
        }

        Arrays.sort(new_array, (a,b) -> {
            if(!map.get(a).equals(map.get(b))){
                return map.get(a) - map.get(b);
            }
            return b-a;
        });

        for(int i = 0;i<nums.length;i++){
            nums[i] = new_array[i];
        }
        return nums;
    }
}