class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        for(char c : s1.toCharArray()){
            s1Freq[c-'a']++;
        }

        for(int i =0;i<s1.length();i++){
            windowFreq[s2.charAt(i)-'a']++;
        }

        if(arraysEqual(s1Freq, windowFreq))
            return true;

            for(int i = s1.length();i<s2.length();i++){
                windowFreq[s2.charAt(i)-'a']++;
                windowFreq[s2.charAt(i-s1.length())-'a']--;

                if(arraysEqual(s1Freq, windowFreq)){
                    return true;
                }
                
            }
            return false;
        }
        
    private boolean arraysEqual(int[] arr1, int[] arr2){
        for(int i =0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}