class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }

        int index = 0;
        for(int i = 0;i<=2;i++){
            int count = hash.getOrDefault(i, 0);
            for(int k = 0;k<count;k++){
                nums[index++] = i;
            }
        }
    }
}