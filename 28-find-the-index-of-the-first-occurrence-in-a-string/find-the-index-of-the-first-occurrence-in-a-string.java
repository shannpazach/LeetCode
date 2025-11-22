class Solution {
    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        if(needle.length() > haystack.length()){
            return -1;
        }

        if(needle.length() == 0){
            return 0;
        }

        for(int i = 0; i<=h.length-n.length;i++){
            if(n[0] == h[i]){
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}