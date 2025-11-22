class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();

        for(char i : ch){
            if(i == '('){
                st.push(')');
            }
            else if(i=='['){
                st.push(']');
            }
            else if(i == '{'){
                st.push('}');
            }

            else if(st.isEmpty() || st.pop()!=i){
                return false;
            }
        }
        return st.isEmpty();
    }
}