class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        StringBuilder ans = new StringBuilder(s);
        for(int j = 0;j<s.length();j++){
            char tem = ans.charAt(0);
            for(int i = 0;i<s.length()-1;i++){
              ans.setCharAt(i,ans.charAt(i+1));
            }
            ans.setCharAt(ans.length()-1, tem);
            if(ans.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}