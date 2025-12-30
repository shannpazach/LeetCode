class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<k;i++){
            char ch = blocks.charAt(i);
            if(ch == 'W'){
                c++;
            }
        }
        min = c;

        for(int i = k;i<blocks.length();i++){
            char in = blocks.charAt(i);
            char out = blocks.charAt(i-k);

            if(in == 'W'){
                c++;
            }
            if(out == 'W'){
                c--;
            }

            min = Math.min(min, c);
        }
        return min;
    }
}