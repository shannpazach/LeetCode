class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        int result;
        if(list.size()==0){
            return 0;
        }
        else if(list.size() < 3){
            result = list.get(0);
        }
        else{
            result = list.get(2);
        }
        return result;
    }
}