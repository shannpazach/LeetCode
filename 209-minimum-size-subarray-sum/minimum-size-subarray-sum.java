class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        for(int end = start; end< nums.length;end++){
            sum = sum + nums[end];

            while(sum>=target){
                min = Math.min(min, end-start+1);
                sum = sum - nums[start];
                start++;
            }
        }
        return (min == Integer.MAX_VALUE ? 0 : min);
    }
}