class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                counter++;
            }
            else if(ch==')'){
                counter--;
            }
            max = Math.max(max, counter);
        }
        return max;
    }
}