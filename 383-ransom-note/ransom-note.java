class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransome = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch : ransome){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }

        for(char mg : mag){
            map2.put(mg, map2.getOrDefault(mg, 0)+1);
        }

        for(int i = 0; i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(!map2.containsKey(c) || (map1.get(c) > map2.get(c))){
                return false;
            }
        }
        return true;
    }
}