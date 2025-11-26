class Solution {
    public String removeOuterParentheses(String s) {
        return stringBuilder(s);
    }

    private String stringBuilder(String str){
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(Character ch : str.toCharArray()){
            if(ch=='('){
                if(counter>0){
                    counter++;
                    sb.append(ch);
                }
                else{
                    counter++;
                }
            }
            else if(ch == ')'){
                if(counter>1){
                    counter--;
                    sb.append(ch);
                }
                else{
                    counter--;
                }
            }
        }
        return sb.toString();
    }
}