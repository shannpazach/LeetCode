class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if(n<3){
            return 0;
        }

        int[] freq = new int[26];
        int distinct = 0;
        int c = 0;

        for(int i = 0;i<3;i++){
            int index = s.charAt(i) - 'a';
            if(freq[index] == 0){
                distinct++;
            }

            freq[index]++;
        }
        if(distinct == 3){
            c++;
        }

        for(int i = 3;i<n;i++){
            int outgoing = s.charAt(i-3) - 'a';
            int incoming = s.charAt(i) - 'a';

            freq[outgoing]--;
            if(freq[outgoing] == 0){
                distinct--;
            }

            if(freq[incoming] == 0){
                distinct++;
            }
            freq[incoming]++;

            if(distinct==3){
                c++;
            }
        }
        return c;
    }
}