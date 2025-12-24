class Solution {
    private int gcd_number(int a, int b){
        while(b!=0){
            int t = a%b;
            a = b;
            b = t;
        }
        return a;
    }

    private int lcm_number(int a, int b){
        return (a/gcd_number(a, b))*b;
    }

    public int maxLength(int[] nums) {
        int maxLength = 1;
        for(int start = 0; start<nums.length;start++){
            int product = 1;
            int currGCD = 0;
            int currLCM = 1;

            for(int end = start; end<nums.length;end++){
                product = product*nums[end];
                currGCD = (currGCD == 0) ? nums[end] : gcd_number(currGCD, nums[end]);
                currLCM = lcm_number(currLCM, nums[end]);

                if(currLCM > product){
                    break;
                }

                if(product == currGCD*currLCM){
                    maxLength = Math.max(maxLength, end-start+1);
                }
            }
        }
        return maxLength;
    }
}