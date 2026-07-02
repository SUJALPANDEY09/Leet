class Solution {
    private void func(int index,String s,List<List<String>>ans,List<String> path){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        } 
        for(int i = index;i<s.length();i++){
            if(ispalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                func(i+1,s,ans,path);
                path.remove(path.size()-1);
            }
        }
    }
    private boolean ispalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
            return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0,s,ans,path);
        return ans;
    }
}