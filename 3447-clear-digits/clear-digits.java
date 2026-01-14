class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if (!st.isEmpty() && Character.isDigit(ch) && Character.isLetter(st.peek())) {
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