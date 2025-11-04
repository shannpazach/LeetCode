class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        HashSet<Integer> intersect = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            set2.add(i);
        }

        for(int i : set1){
            if(set2.contains(i)){
                intersect.add(i);
            }
        }

        int[] result = new int[intersect.size()];
        int k = 0;
        for(int i : intersect){
            result[k++] = i;
        }
        return result;
    }
}