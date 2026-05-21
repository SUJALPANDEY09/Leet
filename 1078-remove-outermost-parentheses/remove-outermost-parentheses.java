class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i)=='('){
                if(depth > 0){
                    ans.append(s.charAt(i));
                }
                    depth++;
            }
            else{
                depth--;
                if(depth > 0){
                  ans.append(s.charAt(i));  
                }
            }
        }
        return ans.toString();
    }
}