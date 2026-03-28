class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0, maxf = 0, l = 0, r = 0;
        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            maxf = Math.max(maxf, map.get(s.charAt(r)));
            if((r-l+1) - maxf > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l)) == 0)
                    map.remove(s.charAt(l));
                l++;
            }
            if((r-l+1) - maxf <= k){
                maxlen = Math.max(maxlen , r - l + 1);
            }
            r++;
        }

        return maxlen;
    }
}