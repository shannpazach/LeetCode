class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            int diff = arr[i] - arr[i-1];
            min = Math.min(min, diff);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1;i<arr.length;i++){
            int diff_min = arr[i] - arr[i-1];
            if(diff_min == min){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        return result;
    }
}