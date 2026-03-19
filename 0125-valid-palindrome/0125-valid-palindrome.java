class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                t.append(Character.toLowerCase(c));
            }
        }
        t.toString();
        for(int i = 0; i < t.length()/2; i++){
            if(t.charAt(i) != t.charAt(t.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}