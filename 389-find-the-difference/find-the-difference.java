class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();

        for(char i : s.toCharArray()){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }

        char[] t1 = t.toCharArray();

        for(char i : t1){
            if(!map1.containsKey(i) || map1.get(i)==0){
                return i;
            }
            else{
                map1.put(i, map1.get(i)-1);
            }
        }
        return '\0';
    }
}