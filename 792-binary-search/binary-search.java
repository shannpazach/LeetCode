class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] == target){
                return i;
            }
            else {
                i++;
            }
        }
        return -1;
    }
}