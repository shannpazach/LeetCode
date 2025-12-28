class Solution {
    public int[] decrypt(int[] code, int k) {
        int c = 0;
        int n = code.length;
        int[] new_result = new int[code.length];
        if(k==0){
            for(int i = 0;i<code.length;i++){
                new_result[c++] = 0;
            }
        }
        else if(k>0){
            
            for(int i = 0;i<code.length;i++){
                int sum = 0;
                for(int j = 1;j<=k;j++){
                    sum+= code[(i + j) % n];
                }
                new_result[c++] = sum;
            }
        }
        else if(k<0){
            k = -k;
            for(int i = 0;i<code.length;i++){
                int sum = 0;
                for(int j = 1;j<=k;j++){
                    sum += code[(i - j + n) % n];
                }
                new_result[c++] = sum;
            }
        }
        return new_result;
    }
}