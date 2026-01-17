class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!charStack.isEmpty() && charStack.peek() == c) {
                int cnt = countStack.pop() + 1;

                if (cnt == k) {
                    charStack.pop(); // remove group
                } else {
                    countStack.push(cnt);
                }
            } else {
                charStack.push(c);
                countStack.push(1);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            char ch = charStack.pop();
            int cnt = countStack.pop();
            for (int i = 0; i < cnt; i++) {
                sb.append(ch);
            }
        }

        return sb.reverse().toString();
    }
}