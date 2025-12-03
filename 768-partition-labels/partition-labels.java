class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partition = new ArrayList<>();

        int i = 0; // use while so you control index movements
        while (i < s.length()) {
            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(startIndex));

            int j = startIndex + 1;

            while (j < endIndex) {
                int lastIndexOfNextChar = s.lastIndexOf(s.charAt(j));
                if (lastIndexOfNextChar > endIndex) {
                    endIndex = lastIndexOfNextChar;
                }
                j++;
            }

            partition.add(endIndex - startIndex + 1);

            i = endIndex + 1; // now correct because no extra i++
        }

        return partition;
    }
}
