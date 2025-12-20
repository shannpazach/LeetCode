class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] result = new int[arr1.length];

        int index = 0;
        for(int num : arr2){
            if(map.containsKey(num)){
                int freq = map.get(num);
                for(int i = 0;i<freq;i++){
                    result[index] = num;
                    index++;
                }
                map.remove(num);
            }
        }
        int[] leftover = new int[arr1.length - index];
        int k = 0;
        for (int num : arr1) {
            if (map.containsKey(num)) {   // leftover element
                leftover[k++] = num;
                map.put(num, map.get(num) - 1); // decrease count
                if (map.get(num) == 0) map.remove(num);
            }
        }

        Arrays.sort(leftover);

        for (int i = 0; i < leftover.length; i++) {
            result[index++] = leftover[i];
        }
        return result;
    }
}