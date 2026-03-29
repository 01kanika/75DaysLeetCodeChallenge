class Solution {
    public boolean isValid(String s) {
       Stack<Character> ans = new Stack<>();
       for(char ch : s.toCharArray()){
        if(ch == '(' || ch == '{' || ch == '['){
            ans.push(ch);
        } else {
            if(ans.isEmpty()) {
                return false;
            }
            char top = ans.pop();
            if(ch == ')' && top != '('){
                return false;
            }
            if(ch == '}' && top != '{'){
                return false;
            }
            if(ch == ']' && top != '['){
                return false;
            }
        }
       }
        return ans.isEmpty();
   }
}