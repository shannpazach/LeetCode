class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums.length-1;
        int second_last = nums.length-2;
        int product = (nums[last]-1) * (nums[second_last]-1);

        return product;
    }
}