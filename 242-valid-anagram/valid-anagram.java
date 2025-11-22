class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] t1 = t.toCharArray();
        char[] s1 = s.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(s1);

        if(new String(s1).equals(new String(t1))){
            return true;
        }
        return false;
    }
}