class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int sum;
        boolean found = false;

        for(int start = 0;start<nums.size();start++){
            sum = 0;
            for(int end = start;end<nums.size();end++){
                sum = sum + nums.get(end);

                int length = end - start + 1;
                if(length >= l && length <= r){
                    if(sum>0){
                        min = Math.min(sum, min);
                        found = true;
                    }
                }    
            }
        }
        if(found == true){
            return min;
        }
        return -1;
    }
}