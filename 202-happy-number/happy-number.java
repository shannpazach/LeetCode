class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int new_number = n;
        int extracted;

        while(new_number!=1 && !seen.contains(new_number)){
            seen.add(new_number);
            int temp = new_number;
            int sum =0;

            while(temp>0){
                extracted = temp%10;
                sum = sum + (extracted*extracted);
                temp = temp/10;
            }

            new_number = sum;
        }
        if(new_number == 1){
            return true;
        }
        else{
            return false;
        }
    }
}