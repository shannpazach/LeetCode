class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stringBuilder(s).equals(stringBuilder(t));
    }
        private String stringBuilder(String str){
            Stack<Character> st = new Stack<>();
            for(Character c : str.toCharArray()){
                if(c == '#'){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }
                else{
                    st.push(c);
                }
            }
            StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}