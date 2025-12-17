class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] copyArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArray);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i : copyArray){
            if(!map.containsKey(i)){
                map.put(i, rank);
                rank++;
            }
        }

        int result[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}