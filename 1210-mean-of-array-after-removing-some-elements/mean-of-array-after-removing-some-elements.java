class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum = 0;
        double count = 0;
        int percent_remove = (arr.length*5)/100;
        for(int i = percent_remove; i<arr.length-percent_remove;i++){
            sum = sum + arr[i];
            count++;
        }
        return sum/count;
    }
}