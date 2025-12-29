class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        if(nums.length < 2*k + 1){
            Arrays.fill(result, -1);
            return result;
        }

        for(int i = 0;i<k;i++){
            result[i] = -1;
        }

        long sum = 0;
        for(int i = 0;i<(2*k+1);i++){
            sum = sum + nums[i];
        }
        result[k] = (int)(sum/(2*k+1));

        for (int i = k + 1; i < nums.length - k; i++) {
            sum = sum - nums[i - k - 1] + nums[i + k];
            result[i] = (int)(sum / (2 * k + 1));
        }

        for(int i = nums.length-k;i<nums.length;i++){
            result[i] = -1;
        }
        return result;
    }
}