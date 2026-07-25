class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Stack<Character> st = new Stack<>();
        boolean[] vis =new boolean[26];
        for(int j = 0;j<s.length();j++){
            map.put(s.charAt(j),map.get(s.charAt(j)) - 1);
            if(vis[s.charAt(j) - 'a'] == true){
                continue;
            }
            
            while(!st.isEmpty() && st.peek()>s.charAt(j) && map.get(st.peek())>0){
                vis[st.peek() - 'a'] =false;
                st.pop();
            }
            
            st.push(s.charAt(j));
            vis[s.charAt(j) - 'a'] = true;
            

        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}