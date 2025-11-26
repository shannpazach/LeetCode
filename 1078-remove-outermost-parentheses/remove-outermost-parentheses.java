class Solution {
    public String removeOuterParentheses(String s) {
        return stringBuilder(s);
    }

    private String stringBuilder(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int counter = 0;
        for(Character ch : str.toCharArray()){
            if(ch=='('){
                if(counter>0){
                    counter++;
                    st.push(ch);
                    sb.append(st.pop());
                }
                else{
                    counter++;
                }
            }
            else if(ch == ')'){
                if(counter>1){
                    counter--;
                    st.push(ch);
                    sb.append(st.pop());
                }
                else{
                    counter--;
                }
            }
        }
        return sb.toString();
    }
}