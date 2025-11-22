class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for(int i = 0; i<s.length();i++){
            int value = map.get(ch[i]);
            if(i< s.length()-1 && value<map.get(ch[i+1])){
                result-= value;
            }
            else{
                result+=value;
            }
        }
        return result;
    }
}