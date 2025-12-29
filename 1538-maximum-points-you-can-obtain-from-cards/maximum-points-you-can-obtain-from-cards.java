class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++){
            sum = sum + cardPoints[i];
        }
        max = sum;

        for(int i = 0;i<k;i++){
            sum = sum + cardPoints[cardPoints.length-1-i] - cardPoints[k-i-1];
            max = Math.max(sum, max);
        }
        return max;
    }
}