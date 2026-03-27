class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] freq = new boolean[256];

        int maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            Arrays.fill(freq, false);
            for (int j = i; j < s.length(); j++) {
                if(!freq[s.charAt(j)]){
                    freq[s.charAt(j)] = true;
                    maxlen = Math.max(maxlen, j-i+1);
                } else
                    break;
            }
        }
        return maxlen;
    }
}