class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int last = st.pop();
                int secondLast = st.peek();
                int sum = last + secondLast;
                st.push(last);
                st.push(sum);
            } 
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } 
            else if (op.equals("C")) {
                st.pop();
            } 
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : st) {
            total += score;
        }

        return total;
    }
}
