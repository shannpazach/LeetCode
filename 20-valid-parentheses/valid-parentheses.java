class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(st.isEmpty() || st.pop()!=map.get(c)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}