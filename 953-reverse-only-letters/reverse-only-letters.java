class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int front = 0;
        int back = ch.length-1;

        while(front<back){
            while(front<back && !Character.isLetter(ch[front])){
                    front++;
                 }
            
            while(front<back && !Character.isLetter(ch[back])){
                    back--;
                 }
            
            char temp = ch[front];
            ch[front] = ch[back];
            ch[back] = temp;
            front++;
            back--;
        }
        return new String(ch);
    }
}