class Solution {
    public int dominantIndex(int[] nums) {
        int max_number = nums[0];
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max_number){
                max_number = nums[i];
                index = i;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(i == index){
                continue;
            }

            if(max_number < 2*nums[i]){
                return -1;
            }
        }
        return index;
    }
}