class Solution {
    public String makeGood(String s) {
        return stringBuilder(s);
    }

    private String stringBuilder(String str){
        Stack<Character> st = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32){
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