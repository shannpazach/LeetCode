class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.offer(entry);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int i =0;

        while(!minHeap.isEmpty()){
            result[i++] = minHeap.poll().getKey();
        }
        return result;
    }
}