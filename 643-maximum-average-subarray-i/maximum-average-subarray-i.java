class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double avg_max = 0;
        for(int i =0;i<k;i++){
            sum = sum+nums[i];
        }

        avg_max = sum/k;

        for(int i = k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            avg_max = Math.max(sum/k, avg_max);
        }
        return avg_max;
    }
}