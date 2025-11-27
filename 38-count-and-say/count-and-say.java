class Solution {
    public String countAndSay(int n) {
        String term = "1";
        for(int i =2;i<=n;i++){
            term = countAndSay(term);
        }
        return term;
    }

    private String countAndSay(String s){
        StringBuilder sb = new StringBuilder();
        int c = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                c++;
            }
            else{
                sb.append(c).append(s.charAt(i-1));
                c = 1;
            }
        }

        sb.append(c).append(s.charAt(s.length()-1));
        return sb.toString();
    }
}