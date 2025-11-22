class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        char result = 0;
        for(char i : s1){
            result = (char)(result ^ i);
        }

        for(char i : t1){
            result = (char)(result ^ i);
        }
        return result;
    }
}