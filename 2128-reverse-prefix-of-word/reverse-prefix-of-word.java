class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int index = -1;
        for(int i = 0;i<word.length();i++){
            st.push(word.charAt(i));
            if(word.charAt(i) == ch){
                index = i;
                break;
            } 
        }

        if(index == -1){
            return word;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.append(word.substring(index+1));
        return sb.toString();
    }
}