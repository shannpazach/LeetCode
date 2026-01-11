class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = n - i;  // candidate X = number of elements from i to end
            if (nums[i] >= x && (i == 0 || nums[i-1] < x)) {
                return x;  // found the special number
            }
        }
        return -1;
    }
}