class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            set2.add(i);
        }

        for(int i : set1){
            if(set2.contains(i)){
                result.add(i);
            }
        }

        int[] final_result = new int[result.size()];
        int index = 0;
        for(int i : result){
            final_result[index++] = i;
        }
        return final_result;
    }
}