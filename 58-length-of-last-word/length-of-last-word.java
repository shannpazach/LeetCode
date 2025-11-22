class Solution {
    public int lengthOfLastWord(String s) {
        String sh = s.stripTrailing(); // Hello World
        int c = 0;

        for(int i = sh.length()-1; i >=0 ; i--){
            if(sh.charAt(i) == ' '){
                break;
            }
            c++;
        }
        return c;
    }
}