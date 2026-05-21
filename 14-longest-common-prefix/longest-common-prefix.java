class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        for(int j = 0 ; j<strs[0].length();j++){
            for(int i = 1; i< strs.length;i++){
                if(j<strs[i].length() && strs[0].charAt(j)==strs[i].charAt(j)) continue;
                else{
                    return  ans.toString();
                }
            }
            ans.append(strs[0].charAt(j));
        }
        if(ans.length()>0)return ans.toString();
        else{return "";}
    }
}