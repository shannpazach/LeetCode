class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for(String word : path.split("/")){
            if(word.equals(".") || word.equals("")){
                continue;
            }
            if(word.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : st) {
            sb.append("/").append(dir);
        }
        return sb.length()==0? "/":sb.toString();
    }
}