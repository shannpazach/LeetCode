class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start<end){
            while(start<end && 
            !(ch[start]=='A' || ch[start]=='E' || ch[start]=='I' || ch[start]=='O' || ch[start]=='U' || 
              ch[start]=='a' || ch[start]=='e' || ch[start]=='i' || ch[start]=='o' || ch[start]=='u')){
                start++;
            }

            while(start<end && 
            !(ch[end]=='A' || ch[end]=='E' || ch[end]=='I' || ch[end]=='O' || ch[end]=='U' || 
              ch[end]=='a' || ch[end]=='e' || ch[end]=='i' || ch[end]=='o' || ch[end]=='u')){
                end--;
            }

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--; 
        }
        return new String(ch);
    }
}