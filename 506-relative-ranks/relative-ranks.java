class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] sorted = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted,Collections.reverseOrder());

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<sorted.length;i++){
            map.put(sorted[i], i+1);
        }

        String[] result = new String[score.length];
        for(int i =0;i<score.length;i++){
            int rank = map.get(score[i]);
            if (rank == 1) result[i] = "Gold Medal";
            else if (rank == 2) result[i] = "Silver Medal";
            else if (rank == 3) result[i] = "Bronze Medal";
            else result[i] = String.valueOf(rank);
        }
        return result;
    }
}