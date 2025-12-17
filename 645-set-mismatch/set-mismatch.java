class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i = 1; i <= nums.length; i++){
    if(!map.containsKey(i)){
        result[1] = i;       // missing
    } else if(map.get(i) == 2){
        result[0] = i;       // duplicate
    }
}
        return result;
    }
}