class Solution {
    public String removeDuplicates(String s) {
        return stringBuilder(s);
    }
    private String stringBuilder(String str){
        Stack<Character> st = new Stack<>();

        for(Character ch : str.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}